package com.babyazalea.helloworld



fun main() {
 val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
 println(sum(3,5))

// even shorter
 val sum1 = {a:Int, b:Int -> println(a + b)}
 sum1(3,5)
}
