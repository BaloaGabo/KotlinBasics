package com.example.firsttest.sintaxis

fun main(){

    val mapOfPokemon = mutableMapOf("Pikachu" to  "Electric","Charmander" to "Fire")

    println(mapOfPokemon["Pikachu"])

    mapOfPokemon.put("Squirtle", "Water")
    mapOfPokemon["Mew"] = "Psychic"

    println(mapOfPokemon)
}