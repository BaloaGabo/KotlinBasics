package com.example.firsttest.sintaxis

fun main(){

    val Gabriel = Person("Gabriel","Baloa", CivilStatus.Single)
    val Dulce = Person("Dulce","Ferreira",CivilStatus.Single)
    val Victor = Person("Victor","Medina",CivilStatus.Comprometed)
    val Marianto = Person("Marianto","Sanna",CivilStatus.Comprometed)

    if(Gabriel.civilStatus == Dulce.civilStatus){
        println("Tienen el mismo estado Civil")
    }else{
        println("No tienen el mismo estado Civil")
    }

}