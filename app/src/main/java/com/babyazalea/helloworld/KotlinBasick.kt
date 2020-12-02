package com.babyazalea.helloworld

// Super Class, Parent Class, Base Class
open class Car(val name: String, val brand: String){
 open var range: Double = 0.0

 fun extendRange(amount: Double){
  if(amount > 0)
   range += amount
 }

 open fun drive(distance: Double){
  println("Drove for $distance KM")
 }


}

// Sub Class, Child Class or Derived Class of Vehicle
open class ElectricCar(name: String, brand: String, batteryLife: Double): Car(name, brand){
 override var range = batteryLife * 6

 var chargerType = "type1"
 override fun drive(distance: Double){
  println("Drove for $distance KM on electricity")
 }

 fun drive(){
  println("Drove for $range KM on electricity")
 }
}

fun main(){
 var myCar = Car("A3", "audi")
 var myECar = ElectricCar("S-model", "Tesla", 85.0)

 myECar.chargerType = "Type2"
 myECar.extendRange(200.0)

 myECar.drive()

//  Polymorphism
 myCar.drive(200.0)
 myECar.drive(200.0)
}
