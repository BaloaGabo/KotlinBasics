package com.example.firsttest.sintaxis

fun main(){

    val listOfPokemon = mutableListOf<String>("Pikachu","Charmander","Squirtle")
    listOfPokemon.add("Bulbasaur")
    listOfPokemon.add("Mew")
    listOfPokemon.add("Pikachu")

    println("Lista de Pokemons")
    println(listOfPokemon)

    val setOfPokemon = mutableSetOf<String>("Pikachu","Charmander","Squirtle")
    setOfPokemon.add("Bulbasaur")
    setOfPokemon.add("Mew")
    setOfPokemon.add("Pikachu")

    println("Set de Pokemons")
    println(setOfPokemon)

    /*Dentro de un Set los valores no estan ordenados, por lo que no se pueden buscar de forma
    especifica por referencia numerica.
     */
}