package clases

class Koopa:
Enemy("Koopa",2){
    override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                val state = "Shell"
                println("El estado es ahora $state")

            }
            "Enemy" -> changeDirection()
        }

    }

}