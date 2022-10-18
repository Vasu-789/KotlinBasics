package com.vasu789.kotlinbasics

fun main()
{
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "String")
    println(anyTypes.size)
    println(months[1])

    for(month in months)
    {
        println(month)
    }

    val addionalMonths = months.toMutableList();
    val newMonths = arrayOf("April", "May", "June")
    addionalMonths.addAll(newMonths)
    addionalMonths.add("July")
    val remainingMonths = arrayOf("August", "September", "October", "November", "December")
    addionalMonths.addAll(remainingMonths)
    println(addionalMonths)


    val days = mutableListOf<String>("Sun", "Mon", "Tues")
    days.add("Wed")
    days.add("Thurs")
    days[2] = "Tuesday"
    days.removeAt(3)
    val removeList = mutableListOf<String>("Sun", "Mon")
    days.removeAll(removeList)
    println(days)
    days.removeAll(days)
    println(days)
}