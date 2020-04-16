package com.theapache64.top250.generators

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.internal.LinkedTreeMap
import com.theapache64.top250.models.IMDBMovie
import com.theapache64.top250.utils.removeNewLinesAndMultipleSpaces
import java.io.File
import java.net.URL

private val ID_REGEX = "<td class=\"titleColumn\">.+?title\\/(?<imdbId>tt\\d+)".toRegex()
private val JSON_REGEX =
    "<script type=\"application\\/ld\\+json\">(?<json>.+?)<\\/script>".toRegex(RegexOption.UNIX_LINES)
private const val IS_USE_CACHE = false

fun main(args: Array<String>) {

    val local250HtmlFile = File("top250.html")

    @Suppress("ConstantConditionIf")
    val topHtml = if (IS_USE_CACHE && local250HtmlFile.exists()) {
        local250HtmlFile.readText()
    } else {
        val url = "https://www.imdb.com/chart/top/"
        val topHtml = URL(url).readText().removeNewLinesAndMultipleSpaces()
        local250HtmlFile.writeText(topHtml)
        topHtml
    }

    val imdbIds = mutableListOf<String>()
    for (result in ID_REGEX.findAll(topHtml)) {
        imdbIds.add(result.groups["imdbId"]!!.value)
    }


    println("Got ${imdbIds.size} ids")

    // looping through each id
    val movieList = mutableListOf<IMDBMovie>()
    val gson = GsonBuilder()
        .setPrettyPrinting()
        .create()

    for ((index, imdbId) in imdbIds.withIndex()) {
        println("----------------------------------------")
        println("${index + 1}) Getting $imdbId")
        val localMovieHtmlFile = File("movies_html_cache/$imdbId.html")

        val moviesHtml = if (IS_USE_CACHE && localMovieHtmlFile.exists()) {
            localMovieHtmlFile.readText()
        } else {
            val url = "https://www.imdb.com/title/$imdbId/"
            val movieHtml = URL(url).readText().removeNewLinesAndMultipleSpaces()
            if (!localMovieHtmlFile.parentFile.exists()) {
                localMovieHtmlFile.parentFile.mkdirs()
            }
            localMovieHtmlFile.writeText(movieHtml)
            movieHtml
        }

        try {
            val movieJson = JSON_REGEX.find(moviesHtml)!!.groups["json"]!!.value
            val movie = gson.fromJson(movieJson, IMDBMovie::class.java)

            if (movie.genre is String) {
                movie.genre = listOf(movie.genre)
            }

            if (movie.director is LinkedTreeMap<*, *>) {
                movie.director = listOf(gson.toJsonTree(movie.director))
            }

            println("🎥 ${movie.name}")

            movieList.add(movie)
        } catch (e: Exception) {
            e.printStackTrace()
            File("error.html").writeText(moviesHtml)
            break
        }
    }

    println("All ${movieList.size} collected")


    val top250JsonFile = File("top250.json")
    top250JsonFile.writeText(gson.toJson(movieList.sortedByDescending { it.name }))


}