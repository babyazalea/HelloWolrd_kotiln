package com.babyazalea.helloworld

interface Drivable{
 val maxSpeed: Double
 fun drive(): String
 fun brake(){
  println("The drivable is braking")
 }
}


// Super Class, Parent Class, Base Class
open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
 open var range: Double = 0.0

 fun extendRange(amount: Double){
  if(amount > 0)
   range += amount
 }
// override fun drive(): String = "driving the interface drive"
 override fun drive(): String {
  return "driving the interface drive"
 }

 open fun drive(distance: Double){
  println("Drove for $distance KM")
 }


}

// Sub Class, Child Class or Derived Class of Vehicle
open class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double): Car(maxSpeed, name, brand){
 override var range = batteryLife * 6

 var chargerType = "type1"
 override fun drive(distance: Double){
  println("Drove for $distance KM on electricity")
 }

 override fun drive(): String{
  return "Drove for $range KM on electricity"
 }

 override fun brake() {
  super.brake()
 }
}

fun main(){
 var myCar = Car(200.0,"A3", "audi")
 var myECar = ElectricCar(240.0,"S-model", "Tesla", 85.0)

 myECar.chargerType = "Type2"
 myECar.extendRange(200.0)

 myECar.drive()
 myECar.brake()
//  Polymorphism
 myCar.drive(200.0)
 myECar.drive(200.0)
}
