package com.theapache64.top250.generators

import java.net.URLEncoder

val data = """
    The Shawshank Redemption (1994) 9.2
    The Godfather (1972) 9.1
    The Godfather: Part II (1974) 9.0
    The Dark Knight (2008) 9.0
    12 Angry Men (1957) 8.9
    Schindler's List (1993) 8.9
    The Lord of the Rings: The Return of the King (2003) 8.9
    Pulp Fiction (1994) 8.8
    The Good, the Bad and the Ugly (1966) 8.8
    The Lord of the Rings: The Fellowship of the Ring (2001) 8.8
    Fight Club (1999) 8.8
    Forrest Gump (1994) 8.8
    Inception (2010) 8.7
    Star Wars: Episode V - The Empire Strikes Back (1980) 8.7
    The Lord of the Rings: The Two Towers (2002) 8.7
    The Matrix (1999) 8.6
    Goodfellas (1990) 8.6
    One Flew Over the Cuckoo's Nest (1975) 8.6
    Seven Samurai (1954) 8.6
    Se7en (1995) 8.6
    City of God (2002) 8.6
    Life Is Beautiful (1997) 8.6
    The Silence of the Lambs (1991) 8.6
    It's a Wonderful Life (1946) 8.6
    Star Wars: Episode IV - A New Hope (1977) 8.6
    Parasite (2019) 8.6
    Saving Private Ryan (1998) 8.5
    Spirited Away (2001) 8.5
    The Green Mile (1999) 8.5
    Interstellar (2014) 8.5
    Léon: The Professional (1994) 8.5
    The Usual Suspects (1995) 8.5
    Harakiri (1962) 8.5
    The Lion King (1994) 8.5
    American History X (1998) 8.5
    The Pianist (2002) 8.5
    Judgment Day (1991) 8.5
    Back to the Future (1985) 8.5
    Modern Times (1936) 8.5
    Psycho (1960) 8.5
    Gladiator (2000) 8.5
    City Lights (1931) 8.5
    The Intouchables (2011) 8.5
    The Departed (2006) 8.5
    Whiplash (2014) 8.5
    The Prestige (2006) 8.5
    Once Upon a Time in the West (1968) 8.5
    Grave of the Fireflies (1988) 8.4
    Casablanca (1942) 8.4
    Joker (2019) 8.4
    Rear Window (1954) 8.4
    Cinema Paradiso (1988) 8.4
    Alien (1979) 8.4
    Apocalypse Now (1979) 8.4
    Raiders of the Lost Ark (1981) 8.4
    Memento (2000) 8.4
    The Great Dictator (1940) 8.4
    The Lives of Others (2006) 8.4
    Django Unchained (2012) 8.4
    Paths of Glory (1957) 8.4
    The Shining (1980) 8.4
    Avengers: Infinity War (2018) 8.4
    WALL·E (2008) 8.4
    Sunset Blvd. (1950) 8.4
    Spider-Man: Into the Spider-Verse (2018) 8.4
    Princess Mononoke (1997) 8.4
    Dr. Strangelove (1964) 8.4
    Oldboy (2003) 8.4
    Witness for the Prosecution (1957) 8.4
    Avengers: Endgame (2019) 8.3
    The Dark Knight Rises (2012) 8.3
    Once Upon a Time in America (1984) 8.3
    Aliens (1986) 8.3
    Your Name. (2016) 8.3
    Coco (2017) 8.3
    American Beauty (1999) 8.3
    (2019) 8.3
    Braveheart (1995) 8.3
    Das Boot (1981) 8.3
    3 Idiots (2009) 8.3
    Toy Story (1995) 8.3
    High and Low (1963) 8.3
    Taare Zameen Par (2007) 8.3
    Star Wars: Episode VI - Return of the Jedi (1983) 8.3
    Amadeus (1984) 8.3
    Reservoir Dogs (1992) 8.3
    Inglourious Basterds (2009) 8.3
    Good Will Hunting (1997) 8.3
    A Space Odyssey (1968) 8.3
    Requiem for a Dream (2000) 8.3
    Vertigo (1958) 8.3
    M (1931) 8.3
    Dangal (2016) 8.3
    Eternal Sunshine of the Spotless Mind (2004) 8.3
    Citizen Kane (1941) 8.3
    The Hunt (2012) 8.3
    Full Metal Jacket (1987) 8.3
    North by Northwest (1959) 8.3
    A Clockwork Orange (1971) 8.3
    Capernaum (2018) 8.2
    Snatch (2000) 8.2
    The Kid (1921) 8.2
    Bicycle Thieves (1948) 8.2
    Singin' in the Rain (1952) 8.2
    Scarface (1983) 8.2
    Taxi Driver (1976) 8.2
    Amélie (2001) 8.2
    Lawrence of Arabia (1962) 8.2
    The Sting (1973) 8.2
    Toy Story 3 (2010) 8.2
    Metropolis (1927) 8.2
    For a Few Dollars More (1965) 8.2
    Ikiru (1952) 8.2
    A Separation (2011) 8.2
    Double Indemnity (1944) 8.2
    The Apartment (1960) 8.2
    To Kill a Mockingbird (1962) 8.2
    Incendies (2010) 8.2
    Indiana Jones and the Last Crusade (1989) 8.2
    Up (2009) 8.2
    L.A. Confidential (1997) 8.2
    Monty Python and the Holy Grail (1975) 8.2
    Heat (1995) 8.2
    Rashomon (1950) 8.2
    Die Hard (1988) 8.2
    Yojimbo (1961) 8.2
    Batman Begins (2005) 8.2
    Green Book (2018) 8.2
    Downfall (2004) 8.2
    Unforgiven (1992) 8.2
    Children of Heaven (1997) 8.2
    Come and See (1985) 8.2
    Some Like It Hot (1959) 8.2
    Howl's Moving Castle (2004) 8.2
    Ran (1985) 8.2
    The Great Escape (1963) 8.2
    All About Eve (1950) 8.2
    A Beautiful Mind (2001) 8.2
    Casino (1995) 8.2
    Pan's Labyrinth (2006) 8.2
    My Neighbor Totoro (1988) 8.2
    The Secret in Their Eyes (2009) 8.2
    Raging Bull (1980) 8.2
    Lock, Stock and Two Smoking Barrels (1998) 8.2
    The Wolf of Wall Street (2013) 8.1
    The Treasure of the Sierra Madre (1948) 8.1
    Judgment at Nuremberg (1961) 8.1
    There Will Be Blood (2007) 8.1
    Three Billboards Outside Ebbing, Missouri (2017) 8.1
    My Father and My Son (2005) 8.1
    The Gold Rush (1925) 8.1
    Chinatown (1974) 8.1
    Dial M for Murder (1954) 8.1
    V for Vendetta (2005) 8.1
    The Seventh Seal (1957) 8.1
    Inside Out (2015) 8.1
    No Country for Old Men (2007) 8.1
    Warrior (2011) 8.1
    Shutter Island (2010) 8.1
    Trainspotting (1996) 8.1
    The Elephant Man (1980) 8.1
    The Sixth Sense (1999) 8.1
    The Thing (1982) 8.1
    Room (2015) 8.1
    Gone with the Wind (1939) 8.1
    Jurassic Park (1993) 8.1
    The Bridge on the River Kwai (1957) 8.1
    Blade Runner (1982) 8.1
    Wild Strawberries (1957) 8.1
    Finding Nemo (2003) 8.1
    The Third Man (1949) 8.1
    On the Waterfront (1954) 8.1
    Stalker (1979) 8.1
    Fargo (1996) 8.1
    Kill Bill: Vol. 1 (2003) 8.1
    Gran Torino (2008) 8.1
    The Truman Show (1998) 8.1
    Tokyo Story (1953) 8.1
    The Deer Hunter (1978) 8.1
    Memories of Murder (2003) 8.1
    Wild Tales (2014) 8.1
    The Bandit (1996) 8.1
    Andhadhun (2018) 8.1
    The Big Lebowski (1998) 8.1
    Klaus (2019) 8.1
    Mary and Max (2009) 8.1
    In the Name of the Father (1993) 8.1
    Gone Girl (2014) 8.1
    Hacksaw Ridge (2016) 8.1
    The Grand Budapest Hotel (2014) 8.1
    Ford v Ferrari (2019) 8.1
    Mr. Smith Goes to Washington (1939) 8.1
    The General (1926) 8.1
    How to Train Your Dragon (2010) 8.1
    Persona (1966) 8.1
    Before Sunrise (1995) 8.1
    Catch Me If You Can (2002) 8.1
    Sherlock Jr. (1924) 8.1
    Prisoners (2013) 8.1
    12 Years a Slave (2013) 8.1
    Cool Hand Luke (1967) 8.1
    The Wages of Fear (1953) 8.1
    Mad Max: Fury Road (2015) 8.1
    Stand by Me (1986) 8.1
    Network (1976) 8.1
    Into the Wild (2007) 8.1
    Barry Lyndon (1975) 8.1
    Monty Python's Life of Brian (1979) 8.1
    Million Dollar Baby (2004) 8.1
    Platoon (1986) 8.1
    Hachi: A Dog's Tale (2009) 8.1
    Ben-Hur (1959) 8.1
    Rush (2013) 8.1
    Logan (2017) 8.0
    The Passion of Joan of Arc (1928) 8.0
    Andrei Rublev (1966) 8.0
    Dead Poets Society (1989) 8.0
    Harry Potter and the Deathly Hallows: Part 2 (2011) 8.0
    Blows (1959) 8.0
    Rang De Basanti (2006) 8.0
    Amores Perros (2000) 8.0
    Hotel Rwanda (2004) 8.0
    Nausicaä of the Valley of the Wind (1984) 8.0
    Spotlight (2015) 8.0
    The Handmaiden (2016) 8.0
    Portrait of a Lady on Fire (2019) 8.0
    Rebecca (1940) 8.0
    Rocky (1976) 8.0
    Monsters, Inc. (2001) 8.0
    La Haine (1995) 8.0
    It Happened One Night (1934) 8.0
    In the Mood for Love (2000) 8.0
    The Princess Bride (1987) 8.0
    Gangs of Wasseypur (2012) 8.0
    Before Sunset (2004) 8.0
    Ace in the Hole (1951) 8.0
    The Help (2011) 8.0
    The Red Shoes (1948) 8.0
    Paris, Texas (1984) 8.0
    The Invisible Guest (2016) 8.0
    Lagaan: Once Upon a Time in India (2001) 8.0
    The Terminator (1984) 8.0
    Butch Cassidy and the Sundance Kid (1969) 8.0
    Drishyam (2015) 8.0
    Akira (1988) 8.0
    PK (2014) 8.0
    Aladdin (1992) 8.0
    Winter Sleep (2014) 8.0
    Fanny and Alexander (1982) 8.0
    Neon Genesis Evangelion: The End of Evangelion (1997) 8.0
""".trimIndent()

val regEx = "(?<name>.+?) \\((?<year>\\d+)\\) (?<rating>.+)".toRegex()

data class Movie(
    val title: String,
    val year: Int,
    val rating: Float
)

fun main(args: Array<String>) {
    regEx.findAll(data).map { matchResult ->
        Movie(
            matchResult.groups[1]!!.value,
            matchResult.groups[2]!!.value.toInt(),
            matchResult.groups[3]!!.value.toFloat()
        )
    }.toList()
        .sortedByDescending { it.year }
        .forEach { movie ->
            println(
                "🎥 [${movie.title}](https://www.google.com/search?q=${
                    URLEncoder.encode(
                        "${movie.title} ${movie.year}",
                        "UTF-8"
                    )
                })"
            )
            println("📆 ${movie.year}")
            println("🌟 ${movie.rating}")
            println()
            println()
        }
}