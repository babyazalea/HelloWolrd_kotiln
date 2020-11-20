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
    println("isNotEqual is $isNotEqual")

    println("is5greater3 ${-5>3}")
    println("in5LowerEqua13 ${5 <= 3}")
    println("in5GreaterEqua13 ${5 >= 3}")

//    Assingment operators(+=, -=,*=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
    println("myNum is $myNum")

//    Increment & Decrement  Operators(++, --)
    myNum++
    println("myNum is $myNum")
//    below line is excuted but nothing change beacause JUST EXCUTED, not apply.
    println("myNum is ${myNum++}")
//    below line in excuted, and then apply immediately.
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")
}
