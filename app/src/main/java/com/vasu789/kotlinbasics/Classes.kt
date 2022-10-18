package com.vasu789.kotlinbasics

fun main()
{
    var tim = Person("Tim", "Cook")
    var x = Person()
    var johnPeterson = Person(lastName = "Peterson")
    tim.hobby = "To Skateboard"
    tim.stateHobby()
    x.hobby = "Play Video Games"
    x.stateHobby()
    var tony = Person("Tony", "Stark", 30)

//    var phone1 = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
//    var phone2 = MobilePhone("IOS", "Iphone", "14 Pro Max")
//    var phone3 = MobilePhone("Android", "Google", "Pixel 6 Pro")
    // Exercise
    var phone1 = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    phone1.chargeBattery(75)
}

class Person(firstName: String = "John", lastName: String = "Wick")
{
    // Member Variable - Properties
    var firstName : String? = null
    var lastName : String? = null
    var age : Int? = null
    var hobby : String = "Watch Netflix"

    // Initializer Block
    init
    {
        this.firstName = firstName
        this.lastName = lastName
        println("Person Created With firstName : $firstName And lastName : $lastName")
    }

    // Member Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName,lastName)
    {
        this.age = age
        println("And With age : $age")
    }


    // Member Functions - Methods
    fun stateHobby()
    {
        println("$firstName's Hobby Is $hobby")
    }
}

class MobilePhone(osName: String, brand: String, model: String)
{
    var battery : Int = 0;
    init
    {
        println("MobilePhone Create With osName : $osName , brand : $brand, model :$model")
    }

    constructor(osName: String, brand: String, model: String, battery: Int) : this(osName, brand, model)
    {
        this.battery = battery
    }

    fun chargeBattery(battery: Int)
    {
        println("Before Charging Battery Was ${this.battery}")
        this.battery += battery
        println("After Charging Battery Was ${this.battery}")
    }
}