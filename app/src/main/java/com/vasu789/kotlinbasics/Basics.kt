package com.vasu789.kotlinbasics

import java.util.function.DoubleToLongFunction

fun main(){
    // Immutable Variable : val
    // TODO: Add New Functionality

    // Type String
    var myName = "Vasu"
    // Type Int 32 bit
    // Type Inference Finds Out The Type From Context
    var age = 60

    // Integer TYPES : Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 12312313
    val myLong: Long = 12_234_231_567_789_098

    // Floating Point Number Types : Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14454545

    // Booleans The Type Boolean Is Used To Represent Logical Values.
    // It Can Have Two Possible Values True And False.
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    println("First Character " + firstCharInStr)
    println("Last Character " + lastCharInStr)

    println("Hello " + myName)


    // Exercise

    var courseName :String = "Android Masterclass"
    val leet : Float = 13.37F
    val pi : Double = 3.14159265358979
    var myAge : Byte = 25
    var year : Short = 2020
    var phoneNumber: Long = 18881234567
    var isGood : Boolean = true
    var firstCharacter : Char = 'a'


    // String Interpolation
    println("First Character $firstCharInStr And The Length Of myStr Is ${myStr.length}")


    // Arithmetic Operators (+, -, *, /, %)
    var result = 5 + 3
    val a = 5.0
    val b = 3
    var resultDouble: Double
    resultDouble = a / b;
    println(resultDouble)

    // Comparison Operators (==, !=, <, >, <=, >=)
    val isEqual = 5 == 3
    println("isEqual is $isEqual");

    val isNotEqual = 5 != 5;
    println("isNotEqual is $isNotEqual")

    println("Is 5 Greater Than 3 ${5 > 3}")
    println("Is 5 Less Than Equal 3 ${5 <= 3}")
    println("Is 5 Greater Or Equal 3 ${5 >= 3}")

    //Assignment Operators(+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum Is $myNum")
    myNum *= 4
    println("myNum Is $myNum")

    // Increment & Decrement Operators (++, --)
    myNum++
    println("myNum Is $myNum")
    myNum--
    println("myNum Is $myNum")
    println("myNum Is ${myNum++}")
    println("myNum Is ${++myNum}")
    println("myNum Is ${--myNum}")

    // If Statement

    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2){
        println("Use Raw Force")
    } else if(heightPerson1 == heightPerson2) {
      println("Use Your Power Technique 1337")
    } else {
        println("Use Technique")
    }

    age = 17
    if(age >= 21){
        println("Now You May Drink In The US")
    } else if(age >= 18) {
        println("You May Vote Now")
    } else if(age >= 16) {
        println("You May Drive Now")
    } else {
        println("You're Too Young")
    }

    var name = "Vasu"
    if(name == "Vasu") {
        println("Welcome Home $name")
    } else {
        println("Who Are You")
    }

    val isRainy = true
    if(isRainy)
        println("It's Rainy")


    // When Statement

    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Month")
    }

    when(age) {
        !in 0..20 -> println("Now You May Drink In The US")
        in 18..20 -> println("You May Vote Now")
        16, 17 -> println("You May Drive Now")
        else -> println("You're Too Young")
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("$x Is An Int")
        is Double -> println("$x Is An Double")
        is String -> println("$x Is An String")
        else -> println("$x Is None Of The Above")
    }


    // While Statement
    // While Loop Executes A Block Of Code Repeatedly As Long As The Condition Satisfies
    x = 1
    while(x <= 10) {
        print("$x ")
        x++
    }
    println("\nWhile Loop Is Done")

    x = 1
    do {
        print("$x ")
        x++
    } while(x <= 10)
    println("\nDo While Loop Is Done")

    var feltTemp = "Cold"
    var roomTemp = 10
    while(feltTemp == "Cold") {
        roomTemp++
        if(roomTemp >= 20) {
            feltTemp = "Comfy"
            println("It's Comfy Now")
        }
    }

    // For Statement
    println("For Loop")
    for(num in 1..10) {
        print("$num ")
    }
    println()
    for(i in 1 until 10) { // Same As - for(i in 1.until(10))
        print("$i ")
    }
    println()
    for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
        print("$i ")
    }
    println()
    for(i in 10 downTo 1 step 2) { // Same As - for(i in 10.downTo(1).step(2))
        print("$i ")
    }

    // Exercise
    for(num in 1..10000) {
        if(num == 9001)
            print("IT'S OVER 9000!!!")
    }

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel-=5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
        }
    }

    // Break And Continue Keywords

    for(i in 1 until 20){
        // 10/2 = 5
        // 11/2 = 5.5 Which 5 In Terms Of An Int
        if(i/2 == 5) {
            continue
        }
        print("$i ")
    }
    println("\nDone With The Loop")
}