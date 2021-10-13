open class Human(var age: Int, val health: Double){
    var isAlive: Boolean = true 
    fun stayAlive(){
        var test: Double = (0..100).random().toDouble()/100
        if (this.health <= test) this.isAlive = false
    }
}

class Adult(age: Int, health: Double): Human(age, health){
    var haveAJob: Boolean = false
    fun getAJob(){
        this.haveAJob = true
    }
    fun loseAJob(){
        this.haveAJob = false
    }
}

fun main() {
    var roger = Adult(49,0.6)
    var boucle = 1
    roger.getAJob()
    roger.stayAlive()
    while (roger.isAlive){
        roger.loseAJob()
        roger.stayAlive()
        boucle++
    }
    roger.age = roger.age + boucle
    println(roger.age)
}
