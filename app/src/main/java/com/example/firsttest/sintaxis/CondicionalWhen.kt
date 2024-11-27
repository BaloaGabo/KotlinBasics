package com.example.firsttest.sintaxis

fun main(){

    val name = "Gabriel Baloa"
    val age = 29
    val role = "admin"

    when{
        age > 60 -> println("$name es un anciano")
        age > 30 -> println("$name es un adulto")
        age > 18 -> println("$name es un adulto joven")
        else -> println("$name es menor de edad")
    }

    when(role){
        "admin" -> println("Acceso total")
        "seller" -> println("Acceso a Vender")
        else -> println("Acceso denegado")
    }
}