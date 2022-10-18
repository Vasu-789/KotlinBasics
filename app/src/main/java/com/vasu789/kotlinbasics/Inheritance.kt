package com.vasu789.kotlinbasics

// Super Class, Parent Class, Base Class
open class Vehicle
{

}

interface Drivable
{
    val maxSpeed: Double
    fun drive(): String
    fun brake()
    {
        println("The Drivable Is Braking")
    }
}

// Sub Class, Child Class Or Derived Class Of Vehicle,
// Super Class, Parent Class, Base Class Of Electric Car
open class Cars(override val maxSpeed : Double, val name: String, val brand: String) : Drivable
{
    open var range : Double = 0.0

    fun extendRange(amount: Double)
    {
        if(amount > 0)
            range += amount
    }

    //override fun drive() : String = "Driving The Interface Drivable"
    override fun drive() : String
    {
        return "Driving The Interface Drivable"
    }

    open fun drive(distance: Double)
    {
        println("Drove For $distance KM")
    }
}

class ElectricCar(maxSpeed : Double, name: String, brand: String, batteryLife: Double) : Cars(maxSpeed, name, brand)
{
    override var range = batteryLife * 6

    override fun drive(distance: Double)
    {
        println("Drove For $distance KM On Electricity")
    }

    override fun drive() : String
    {
        return "Drove For $range KM On Electricity"
    }

    override fun brake() {
        super.brake()
        println("Break Inside Of The ElectricCar")
    }
}

fun main()
{
    var audiA3 = Cars(200.0, "A3", "Audi")
    var teslaS = ElectricCar(240.0, "S-Model", "Tesla", 85.0)
    teslaS.extendRange(150.0)

    // Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)

    teslaS.drive()
    teslaS.brake()
    audiA3.brake()
}