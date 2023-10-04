package com.example.myapplication

fun ciclos(){
    val nombres = listOf(
        "kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Luigi",
        "Link",
        "Captain",
        "Samus",
        "Pikachu",
        "Jigglepuff",
        "Donkey kong",
        "Yoshi",
    )

    for (nombre in nombres){
        println(nombres)
    }

    for (nombre in nombres){
        println(nombre)
        if (nombre == "Link"){
            println("Personaje encontrado")
            break
        }
    }

    var x = 20
    while(x > 0){
        println(x)
        x--
    }
}


fun regresa(){
    val nombres = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "Maria Ines",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya Maria",
        "Ana Sofia",
        "Jose Juan",
    )
    for (nombre in nombres){
        if (nombre in nombres){
            println("Nombre repetido")
        }
    }
}


// Aquí voy a trabajar con las listas
// listOf es para listas de elementos que se pueden repetir, setOf es para listas con elementos que son únicos


fun continuar(){
    var continuar : String = ""
    var bandera : Boolean = true
    while(bandera == true){
        println()
        //println(constanteGlobal)
        //variablesYConstantes()
        //tiposDeDatos()
        //condicionalIf()
        //rectangleArea()
        //triangulo()
        //promedio()
        //pasoParametros()
        //leerDato()
        //login()
        //datosLogin()
        //calculaPerimetroCirculo()
        //ciclos()
        regresa()
        while(true){
            print("\n¿Desea continuar?(S/N): ")
            continuar = readln().toString()
            if((continuar == "N") || (continuar == "n")){
                bandera = false
                break
            } else if((continuar != "S") && (continuar != "s")){
                println("\nEntrada no válida")
            } else {
                break
            }
        }
    }
}