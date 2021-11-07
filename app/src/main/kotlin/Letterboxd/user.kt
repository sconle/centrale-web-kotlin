package letterboxd.user
import letterboxd.film.films as Film
import letterboxd.rating.ratings as Rating

class users{
    val username: String
    val profile_picture: String? = null
    val first_name: String? = null
    val last_name: String? = null
    val email: String
    val password: String
    val bio: String? = null
    val favorite_films: MutableList?<Film> = null
    val ratings: MutableList?<Rating> = null
    val watchlist: MutableList?<Film> = null
    val film_watched: MutableList?<Film> = null
}