package com.example.myapplication

// Función que hicimos en clase
fun login(user: String, password:String) : Boolean{
    fun validate(input : String) : Boolean{
        if(input.isEmpty()){
            return false
        }
        return true
    }
    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated
}


fun datosLogin(){
    println("Ingresa tu usuario: ")
    var user = readln().toString()
    println("Ingresa tu contraseña: ")
    var password = readln().toString()
    val userValidated = login(user, password)
    println("Usuario loggeado? $userValidated")
}