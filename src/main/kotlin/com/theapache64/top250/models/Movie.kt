package com.theapache64.top250.models

import com.google.gson.annotations.SerializedName


data class Movie(
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
    var directors: List<Director>,
    @SerializedName("duration")
    val duration: String, // PT2H36M
    @SerializedName("genre")
    var genres: List<String>,
    @SerializedName("image")
    val image: String, // https://m.media-amazon.com/images/M/MV5BMzQ4MTBlYTQtMzJkYS00OGNjLTk1MWYtNzQ0OTQ0OWEyOWU1XkEyXkFqcGdeQXVyNDgyODgxNjE@._V1_.jpg
    @SerializedName("keywords")
    val keywords: String, // doctor,hospital,medical school,whistleblower,parsi
    @SerializedName("name")
    val name: String, // Munna Bhai M.B.B.S.
    @SerializedName("review")
    val review: Review,
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
        val ratingValue: String, // 8.1
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

    data class Review(
        @SerializedName("author")
        val author: Author,
        @SerializedName("dateCreated")
        val dateCreated: String, // 2007-12-29
        @SerializedName("inLanguage")
        val inLanguage: String, // English
        @SerializedName("itemReviewed")
        val itemReviewed: ItemReviewed,
        @SerializedName("name")
        val name: String, // The introduction to Munnabhai and Circuit
        @SerializedName("reviewBody")
        val reviewBody: String, // Inspired by the Hollywood movie 'Patch Adam', 'Munnabhai M.B.B.S.' tells the comedic story of a thug who wants to become a doctor. The film has its major share of comedic moments and its dramatic moments. It is indeed an entertaining film with the famously lovable characters like Munnabhai and Circuit. Rajkumar Hirani may have taken the idea of an older outsider wanting to become a doctor from 'Patch Adams' but in essence 'Munnabhai M.B.B.S.' is its own film and it is the performances and comedy that make it worth the watch because most the dramatic moments are a little over the top. While the dialogue in the comedic scenes are witty and hilarious, the ones in the dramatic scenes are a mess.Sanjay Dutt totally nails Munnabhai. It's hard to picture anyone else in the title role. The actor does full justice. It was nice to see Sunil Dutt after a long time and that too as father to his own son. The actor has a strong presence, even in a brief role. Gracy Singh is cute and adorable. Jimmy Shergill is awesome and holds his own as Zaheer and Boman Irani too does very well. However, it is Arshad Warsi who steals the show in a breakthrough performance as one of the most memorable film characters of recent time, Circuit.Most of the songs are well balanced and are good additions to the film. I found Munnabhai's romantic ballad hilarious when he tries to convince the suicider to cut the crap. On the technical side, it's alright. On the whole this is one enjoyable flick. One would have expected more from the second Munnabhai film which I found boring but why should that prevent the pleasure that comes from this movie?
        @SerializedName("@type")
        val type: String // Review
    ) {
        data class Author(
            @SerializedName("name")
            val name: String, // Chrysanthepop
            @SerializedName("@type")
            val type: String // Person
        )

        data class ItemReviewed(
            @SerializedName("@type")
            val type: String, // CreativeWork
            @SerializedName("url")
            val url: String // /title/tt0374887/
        )
    }

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
