package com.example.firsttest.sintaxis

fun main(){

    val Gabriel: Usuario = Usuario(
        "Gabriel",
        28,
        "gabrielbaloa.gb@gmail.com",
        "z1695617q")
    val Dulce: Usuario = Usuario(
        "Dulce",
        24,
        "Dulce@gmail.com",
        "z1234567q")
    val Jose: Usuario = Usuario(
        "Jose",
        31,
        "jose@gmail.com",
        "BA1234567")
    Gabriel.addFriend(Jose)
    Dulce.addFriend(Jose)
    Gabriel.addFriend(Dulce)
    Dulce.addFriend(Gabriel)
    Jose.addFriend(Dulce)
    Jose.addFriend(Gabriel)

    Gabriel.getFriends()
    Jose.getFriends()
    Dulce.getFriends()

    println(Gabriel.name)
    println(Gabriel.age)
    Gabriel.getEmail("admin")
    Gabriel.getDNI("admin")
}