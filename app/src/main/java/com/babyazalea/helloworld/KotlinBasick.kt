package com.babyazalea.helloworld

import java.lang.IllegalArgumentException

fun main(){
    var myCar = Car()
    println("brand is : ${myCar.myBrand}") // this is 'get'
    myCar.maxSpeed = 240 // this is 'set'
    println("Maxspeed is ${myCar.maxSpeed}") // this is 'get'
    println("My model is ${myCar.myModel}") // this is 'get'
}

class Car(){
    lateinit var owner: String

    val myBrand: String = "BMW"
        // Custom getter
        get() {
            return field.toLowerCase()
        }

    var maxSpeed: Int = 250
        // get() = field
        set(value){
            field = if(value > 0) value else throw IllegalArgumentException("MaxSpeed cannot be less than 0")
        }

    var myModel : String = "M5"
        private set

    init {
        this.myModel = "M3"
        owner = "Frank"
    }
}