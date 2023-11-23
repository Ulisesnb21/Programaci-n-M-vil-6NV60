package clases

import clases.clases.Movie
import clases.clases.National
import clases.clases.NationalLowSeason
import clases.clases.Vehicle

fun main() {

    val scaryMovie = Movie( "Scary movie", "Comedia", 88.27)
    println(scaryMovie)
    scaryMovie.createdAt = "2000"
    println(scaryMovie.component1())
    val (name2,gender2,duration2) = scaryMovie
    println("Nuevas variables $name2 $gender2 $duration2")
    val scaryMovie2= scaryMovie.copy(name= "Scary Movie 2", duration = 83.0)
    println("""
        Scary movie: $scaryMovie
        Scary Movie 2: $scaryMovie2
        """.trimIndent())

    val vehicleInstance = Vehicle.create()

    //var saludo = { println("Hola Bedu!")}()
    val suma = {a: Int, b: Int -> a+b}
    //println(suma(4,5))
    val presentarse: (String,Int) -> String = {name,age -> "Me llamo $name y tengo $age años"}
    println(presentarse("Javier",29))

    val saverGrade: (Double, Double) -> String = { expected: Double, saved: Double -> val percentage = saved / expected
    when {
        percentage > 1 -> "Ahorrador pro"
        percentage == 1.0 -> "Buen ahorrador"
        percentage < 1.0 && percentage >=0.8 -> "Almost"
        else -> "Aprendiz saver"
    }
    }
    println(saverGrade(100.0,120.0))
    val saverGrade2 = fun(expected: Double, saved:Double): String{
        val percentage = saved / expected
        return when {
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }
    println(saverGrade2(100.0, 70.0))

    fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int, Int) -> Int): Int {
        return suma(a,b)
    }
    println(sumaOrdenSuperior(4,5, suma))
}

