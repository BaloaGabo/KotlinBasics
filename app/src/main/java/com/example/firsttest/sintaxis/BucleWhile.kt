package com.example.firsttest.sintaxis

fun main(){

    var listOfFriends = listOf("Monica", "Ross","Rachel","Phoebe","Joy","Gunter","Jannice")
    var index = 0
    while(index < listOfFriends.size){

        println(listOfFriends[index])
        //index = index + 1
        index += 1
        //index++
    }
}