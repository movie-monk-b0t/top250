package com.theapache64.top250.models

import com.google.gson.annotations.SerializedName


data class IMDBMovie(

    @SerializedName("actor")
    val actor: List<Actor>,
    @SerializedName("aggregateRating")
    val aggregateRating: AggregateRating,
    @SerializedName("contentRating")
    val contentRating: String, // Not Rated
    @SerializedName("@context")
    val context: String, // http://schema.org
    @SerializedName("creator")
    val creator: List<Creator>,
    @SerializedName("datePublished")
    val datePublished: String, // 2003-12-19
    @SerializedName("description")
    val description: String, // Munna Bhai M.B.B.S. is a movie starring Sanjay Dutt, Arshad Warsi, and Gracy Singh. A gangster sets out to fulfill his father's dream of becoming a doctor.
    @SerializedName("director")
    var director: Any,
    @SerializedName("duration")
    val duration: String, // PT2H36M
    @SerializedName("genre")
    var genre: Any,
    @SerializedName("image")
    val image: String, // https://m.media-amazon.com/images/M/MV5BMzQ4MTBlYTQtMzJkYS00OGNjLTk1MWYtNzQ0OTQ0OWEyOWU1XkEyXkFqcGdeQXVyNDgyODgxNjE@._V1_.jpg
    @SerializedName("keywords")
    val keywords: String, // doctor,hospital,medical school,whistleblower,parsi
    @SerializedName("name")
    val name: String, // Munna Bhai M.B.B.S.
    @SerializedName("trailer")
    val trailer: Trailer,
    @SerializedName("@type")
    val type: String, // Movie
    @SerializedName("url")
    val url: String // /title/tt0374887/
) {
    data class Actor(
        @SerializedName("name")
        val name: String, // Sanjay Dutt
        @SerializedName("@type")
        val type: String, // Person
        @SerializedName("url")
        val url: String // /name/nm0004569/
    )

    data class AggregateRating(
        @SerializedName("bestRating")
        val bestRating: String, // 10.0
        @SerializedName("ratingCount")
        val ratingCount: Int, // 69310
        @SerializedName("ratingValue")
        val ratingValue: Float, // 8.1
        @SerializedName("@type")
        val type: String, // AggregateRating
        @SerializedName("worstRating")
        val worstRating: String // 1.0
    )

    data class Creator(
        @SerializedName("name")
        val name: String, // Vidhu Vinod Chopra
        @SerializedName("@type")
        val type: String, // Person
        @SerializedName("url")
        val url: String // /name/nm0006765/
    )

    data class Director(
        @SerializedName("name")
        val name: String, // Rajkumar Hirani
        @SerializedName("@type")
        val type: String, // Person
        @SerializedName("url")
        val url: String // /name/nm0386246/
    )

    data class Trailer(
        @SerializedName("description")
        val description: String, // A gangster sets out to fulfill his father's dream of becoming a doctor.
        @SerializedName("embedUrl")
        val embedUrl: String, // /video/imdb/vi1188543257
        @SerializedName("name")
        val name: String, // Munna Bhai M.B.B.S. Trailer
        @SerializedName("thumbnail")
        val thumbnail: Thumbnail,
        @SerializedName("thumbnailUrl")
        val thumbnailUrl: String, // https://m.media-amazon.com/images/M/MV5BOTU5ZTViMWQtM2Q5My00MGFlLTljM2EtNGI3ODE3NTBlY2MwXkEyXkFqcGdeQXRodW1ibmFpbC1pbml0aWFsaXplcg@@._V1_.jpg
        @SerializedName("@type")
        val type: String, // VideoObject
        @SerializedName("uploadDate")
        val uploadDate: String // 2018-07-12T06:45:30Z
    ) {
        data class Thumbnail(
            @SerializedName("contentUrl")
            val contentUrl: String, // https://m.media-amazon.com/images/M/MV5BOTU5ZTViMWQtM2Q5My00MGFlLTljM2EtNGI3ODE3NTBlY2MwXkEyXkFqcGdeQXRodW1ibmFpbC1pbml0aWFsaXplcg@@._V1_.jpg
            @SerializedName("@type")
            val type: String // ImageObject
        )
    }
}
