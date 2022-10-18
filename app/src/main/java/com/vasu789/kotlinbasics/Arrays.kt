package com.vasu789.kotlinbasics

fun main()
{
    //val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

    //val numbers = intArrayOf(1, 2, 3, 4, 5, 6)

    val numbers = arrayOf(1, 2, 3, 4, 5, 6)

    print(numbers.contentToString())
    println()

    for(element in numbers)
    {
        print("$element ")
    }
    println()

    println(numbers[0])

    println("Initial Values ${numbers.contentToString()}")
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    println("Changed Values ${numbers.contentToString()}")

    val days = arrayOf("Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    println(fruits.contentToString())
    for(index in fruits.indices)
    {
        println("${fruits[index].name} Is In Index $index")
    }

    for(fruit in fruits.indices)
    {
        println("${fruits[fruit].name}")
    }

    val mix = arrayOf("Sun", "Mon", "Tues", 1, 2, 3, Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    println(mix.contentToString())
}

data class Fruit(val name: String, val price: Double)