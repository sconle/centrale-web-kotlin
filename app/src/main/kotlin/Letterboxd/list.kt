import letterboxd.user.users as User
import letterboxd.film.films as Film

class LB_List{
    val name: String
    val description: String
    val creator: User
    val films: MutableList<Film>

    fun append_film(val film: Film){
        films.add(film)
    }

    fun delete_film(val film: Film){
        films.remove(Film)
    }
}