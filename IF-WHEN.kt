package com.example.myapplication

// Sintaxis del If
fun condicionalIf(){
    val numero = 10
    if(numero < 10){
        println("La condición se cumple")
    } else {
        println("La condición no se cumple")
    }
}

//Sintaxis de la sentencia When (Switch)
fun sentenciaWhen(){
    println("Ingresa un número y te diré a que día de la semana corresponde: ")
    val diaSemana = readln().toInt()
    val nombreDia = when(diaSemana){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Ese día no existe"
    }
}