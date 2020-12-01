package com.babyazalea.helloworld

data class User(val id: Long, var name: String)

fun main(){
   val user1 = User(1, "taeyang")

//    val name = user1.name
//    println(name)
//    user1.name = "eunmin"

    val user2 = User(1, "eunmin")
    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name="yangTae")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) // print yangtae

    val (id, name) = updatedUser
    println("id=$id, name=$name")
}