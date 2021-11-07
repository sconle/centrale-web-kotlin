package letterboxd.rating
import letterboxd.user.users as User
import letterboxd.film.films as Film

class ratings{
    val user: User
    val rate: Int
    val review: String? = null
    val film: Film

    fun set_rating(val new_rate: Int){
        rate = new_rate
    }

    fun set_review(val new_review: String){
        review = new_review
    }
}