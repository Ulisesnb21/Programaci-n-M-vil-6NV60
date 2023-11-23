package clases

class Mario (var vidas: Int =3) {
    init {
        println("Its a me, clases.Mario!")

    }

    private var state = "small"
        set(value) {
            field = value
        }
        get() = field
    private var lives = 3

    private fun die() {
        lives--
        println("Has perdido una vida!")

    }

    public fun collision(collisionObj: String) {
        when (collisionObj) {
            "Goomba" -> die()
            "Super Mushroom" -> state = "Super mario"
            "Fire flower" -> state = "Fire mario"
            else -> println("Objeto desconocido ¡No pasa nada!")
        }
    }
 fun getLives(): String{
     return "$lives vidas"
 }
}