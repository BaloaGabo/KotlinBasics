package com.example.firsttest.sintaxis

fun main(){

    val name = "Gabriel Baloa"
    val role = "admin"
    val age = 29

    if(age > 50){
        println("$name es un adulto mayor")
    }else if (age > 30){
        println("$name es un adulto")
    }else if (age > 18){
        println("$name es un adulto joven")
    }else {
        println("$name es menor de edad")
    }

    if (role == "user"){
        println("Tienes acceso a tu perfil")
    }
    if (role == "admin"){
        println("Tienes acceso a todos los contenidos")
    }
    if (role == "guest"){
        println("Solo anda viendo")
    }
}