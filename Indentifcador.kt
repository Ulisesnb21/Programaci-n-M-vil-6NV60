package com.example.myapplication

fun identificador(){
    println("Ingresa un valor para identificar que tipo de dato se está ingresando")
}


fun identificarTipoDato(dato: Any) {
    when (dato) {
        is String -> println("Es una cadena (String)")
        is Int -> println("Es un entero (Int)")
        is Double -> println("Es un número decimal (Double)")
        else -> println("Es de otro tipo")
    }
}