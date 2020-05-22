package com.theapache64.top250.models

import com.google.gson.annotations.SerializedName


data class MinMovie(
    @SerializedName("actors")
    val actors: List<String>,
    @SerializedName("desc")
    val desc: String, // Some string
    @SerializedName("directors")
    val directors: List<String>,
    @SerializedName("genre")
    val genre: List<String>,
    @SerializedName("image_url")
    val imageUrl: String, // image-url-goes-here
    @SerializedName("thumb_url")
    val thumbUrl: String,
    @SerializedName("imdb_url")
    val imdbUrl: String, // /title/tt0055630/
    @SerializedName("name")
    val name: String, // Movie name goes here
    @SerializedName("rating")
    val rating: Float, // 8.2
    @SerializedName("year")
    val year: Int
)