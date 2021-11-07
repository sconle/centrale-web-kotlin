package letterboxd.film
import java.time
import letterboxd.rating.ratings as Rating

class films{
    val title: String
    val release_date: LocalDate
    val summary: String
    val poster: String
    val background_poster: String
    val ratings: MutableList?<Rating> = null
    val crew: Map
    val cast: Map
    val details: Map
    val genres: MutableList
}