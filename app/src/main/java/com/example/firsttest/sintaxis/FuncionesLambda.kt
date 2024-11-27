package com.example.firsttest.sintaxis

fun main(){

    val friends = listOf("Monica", "Ross","Rachel","Phoebe","Joy","Gunter","Jannice")

    friends.forEach{ name ->
        println(name)
    }

    mylambda("Gabriel", { println(it) } )
}

fun mylambda( name: String, saludar: (fullname: String) -> Unit){

    println("Estoy entrando a la funcion lambda")
    saludar("$name Baloa")
    println("Estoy saliendo de la funcion lambda")
}