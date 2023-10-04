package com.example.myapplication

// Esta constante es inmutable y se conoce en tiempo de compilación, se declara de manera global
const val constanteGlobal = "Esta es una constante en tiempo de compilación"

// Tipos de variables
fun variablesYConstantes(){
    // Creación de variables
    var primeraVariable = "Esta es la creación de la primera variable"
    println(primeraVariable)

    // Creación de constantes en tiempo de ejecución
    val primeraConstante = "Esta es una constante en tiempo de ejecución"
    println(primeraConstante)
}