package com.example.myapplication

fun sumar3Numeros(primerNumero : Int, segundoNumero : Int, tercerNumero : Int): Int{
    return primerNumero + segundoNumero + tercerNumero
}


fun pasoParametros(){
    println("Ingresa el primer número: ")
    var num1 = readln().toInt()
    println("Ingresa el segundo número: ")
    var num2 = readln().toInt()
    println("Ingresa el tercer número: ")
    var num3 = readln().toInt()
    val suma = sumar3Numeros(num1, num2, num3)
    println("El resultado de la suma es: $suma")
}