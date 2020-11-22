package com.babyazalea.helloworld

fun main(){
//    immutable variable
//    TODO: Add new fuctionallity

//    type String
    val myName = "Taeyang"
//    type int 32 bit
    var myAge = 31

//    print("hello " + myName)
//    Data Types
    val myByte: Byte = 12
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

//    Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.123124123123

//    Booleans he type Boolean is used to represent logical values.
//    It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

//    Characters
    val letterChar = "A"
    val digitChar = "1"

//    Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]

//    Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a/b
//    print(resultDouble)

//    Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
//    println("isEqual is $isEqual")

    val isNotEqual = 5!=5
//    String interpolation
    // println("isNotEqual is $isNotEqual")

    // println("is5greater3 ${-5>3}")
    // println("in5LowerEqua13 ${5 <= 3}")
    // println("in5GreaterEqua13 ${5 >= 3}")

//    Assingment operators(+=, -=,*=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
    // println("myNum is $myNum")

//    Increment & Decrement  Operators(++, --)
    myNum++
    // println("myNum is $myNum")
//    below line is excuted but nothing change beacause JUST EXCUTED, not apply.
    // println("myNum is ${myNum++}")
//    below line in excuted, and then apply immediately.
    // println("myNum is ${++myNum}")
    // println("myNum is ${--myNum}")

    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2){
        println("use raw force")
    }else if(heightPerson1 ==  heightPerson2){
        println("use your power technique 1337")
    }else{
        println("use technique")
    }

    val age = 17
   if(age >= 21) {
            println("now you may drink in the US")
        } else if (age >= 18) {
            println("you may vote now")
        }
        else if(age >= 16) {"Live now"
        }
        else {
            println("you're too young")
        }


    var name = "ty"

    if(name == "ty"){
        println("welcome home")
    } else{
        println("who are you")
    }

    val isRainy = true

    if(isRainy){
        println("It's rainy")
    }

    var season = 3

    when(season){
         1 -> println("Spring")
         2 -> println("summer")
         3 -> {
             println("Fall")
             println("Autumn")
         }
         4 -> {
             println("winter")
         }
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 12 downTo 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    when(age){
        !in 21..150 -> println("now you may drink in the US")
        in 18..20 -> println("you may vote now")
        16,17 -> println("you may drive now")
        else -> println("you're too young")
    }

    var x : Any = 13.37f
    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is an String")
        else -> println("$x is none of the above")
    }
}
