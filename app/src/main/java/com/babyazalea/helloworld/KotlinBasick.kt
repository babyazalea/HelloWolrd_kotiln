package com.babyazalea.helloworld

fun main(){
    var ty = Person("Taeyang", "Yu")
    var em = Person()
    var johnPeterson = Person(lastName = "Perterson")
}

class Person  constructor(firstName: String = "Eunmin", lastName: String = "Choi"){
    // Initializer Block
    init {
        println("Initialized a new Person Object with firstName = $firstName and lastName = $lastName")
    }
}
