package com.vasu789.kotlinbasics

fun main()
{
    var myCar = Car()
    println("Brand Is : ${myCar.myBrand}")
    myCar.maxSpeed = 250
    println("maxSpeed Is : ${myCar.maxSpeed}")
    //myCar.maxSpeed = -1
    println("Model Is : ${myCar.model}")
}

class Car()
{
    lateinit var owner : String

    val myBrand : String = "BMW"
        // Custom Getter
        get()
        {
            return field.toLowerCase()
        }

    var maxSpeed : Int = 250
        get() = field
        set(value)
        {
            field = if(value > 0) value else throw IllegalArgumentException("maxSpeed Cannot Be Less Than Zero")
        }

    var model : String = "M5"
        private set

    init
    {
        owner = "Frank"
    }
}