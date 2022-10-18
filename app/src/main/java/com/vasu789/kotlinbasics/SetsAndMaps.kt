package com.vasu789.kotlinbasics

fun main()
{
    val fruits = setOf("Orange", "Apple", "Mango", "Apple", "Grape", "Orange")
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits.elementAt(4))


    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    for(key in daysOfTheWeek.keys)
    {
        println("$key Is To ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruits("Grape", 2.5), "Ok" to Fruits("Apple", 1.2))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    println(newDaysOfWeek.toSortedMap())
    newDaysOfWeek.put(6,"Saturday")
    println(newDaysOfWeek)
}

data class Fruits(val name: String, val price: Double)