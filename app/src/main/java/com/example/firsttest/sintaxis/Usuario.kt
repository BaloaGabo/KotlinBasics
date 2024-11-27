package com.example.firsttest.sintaxis

class Usuario(val name: String,
              val age: Int,
              private val email: String,
              private val DNI: String,
              private val friends:MutableList<Usuario> = mutableListOf()
)
{   fun getFriends(){
    println("Amigos de $name:")
    friends.forEach{ println(it.name) }
}

    fun addFriend(friend: Usuario){
        friends.add(friend)
}
    fun getEmail(role: String){
        if(role == "admin")
            println(email)
    }

    fun getDNI(role: String){
        if(role == "admin")
            println(DNI)

    }
}