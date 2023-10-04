package com.example.myapplication

fun rectangleArea(base:Double=20.0, height:Double=30.0):Double{
    return base*height
}



import kotlin.math.pow
const val  PI = 3.1416f

fun main(args: Array<String>) {
    val radio= 4f
    val area = CirculoArea(radio)
    println("El área del círculo es: $area")
}
fun CirculoArea(radio:Float): Float {
    return PI*radio.pow(2)
}




fun CalcularArea(b: Float, h: Float):Float{
    return b*h
}
fun main() {
    val base: Float = 4f
    val altura: Float = 5f

    val resultado:Float = CalcularArea(base, altura)
    println("El area es $resultado")
}



fun triangulo(){
    println("Ingresa el primer lado del triángulo")
    var lado1 = readln().toInt()
    println("Ingresa el segundo lado del triángulo")
    var lado2 = readln().toInt()
    println("Ingresa el tercer lado del triángulo")
    var lado3 = readln().toInt()
    if(lado1==lado2 && lado1==lado3 && lado2==lado3){
        println("Es equilatero")
    } else if(lado1==lado2 || lado2==lado3){
        println("Es isosceles")
    } else {
        println("Es Escaleno")
    }
}



fun calcularArea(x1: Double, y1: Double): Double {
    return x1 * y1
}

fun calcularAreaP(x1: Double, y1: Double, h1: Double): Double {
    return 2 *(x1*y1 + x1*h1 + y1*h1)
}
fun main() {
    val x1 = 4.0
    val y1 = 3.0
    val h1 = 5.0

    val pendiente = calcularArea(x1, y1)
    println("El area es: $pendiente")

    val area = calcularAreaP(x1,y1,h1)
    println("El area es: $area")
}