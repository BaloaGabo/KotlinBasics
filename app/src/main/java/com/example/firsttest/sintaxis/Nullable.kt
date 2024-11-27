package com.example.firsttest.sintaxis

fun main(){

    var name = "Jose"
    var course: String? = null

    course = "Kotlin"

    if(course == null){
        println("$name is not studying")
    }else{
        println("$name is studying $course")
    }

    var num1: Int? = 10
    //colocar !! permite forzar variables null
    var result = num1!! + 5

    println(result)

}