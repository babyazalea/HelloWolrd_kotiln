package com.babyazalea.helloworld

fun main(){
    // Creating instance of classes
    var ty = Person("Taeyang", "Yu", 31)
    ty.hobby = "play game"
    ty.stateHobby() // output: My hobby is game
    var em = Person() // output: Initialized a new Person object withfirstName = eunmin and lastName = choi
    em.hobby = "writing kkamzi"
    em.stateHobby()

}
// this a is a parameter
class Person(firstName: String = "eunmin", lastName: String ="choi"){
    // Member Variables - Properties
    var age : Int? = null
    var hobby : String? = null
    var firstName : String? = null

    //Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with" + "firstName = $firstName and lastName = $lastName ")
    }

    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
                this.age = age
                println("Initialized a new Person object with" + "firstName = $firstName and lastName = $lastName and $age ")
            }

    // Member Functions - Methods
    fun stateHobby(){
        println("$firstName hobby is $hobby")
    }
}
