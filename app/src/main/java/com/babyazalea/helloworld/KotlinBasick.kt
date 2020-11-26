package com.babyazalea.helloworld

fun main(){
    var name: String = "taeyang"
    // name = null -> Compilation ERROR
    var nullableName : String? = "Taeyang"
    //nullableName = null

    var len = name.length
    var len2 = nullableName?.length
    nullableName?.let { println(it.length) }

    /*
    if(nullableName != null){
        var len2 = nullableName.length
    }else{
        null
    }
    */


}