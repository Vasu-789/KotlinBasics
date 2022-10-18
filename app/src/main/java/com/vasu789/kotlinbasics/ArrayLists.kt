package com.vasu789.kotlinbasics

fun main()
{
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println("Printing ArrayList")
    for(i in arrayList)
    {
        print("$i ")
    }
    println()
    println("ArrayList.get(1)")
    println("${arrayList.get(1)}")


    val arrayList2: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayList2.addAll(list)

    val itr = arrayList2.iterator()
    println("Printing ArrayList2")
    while(itr.hasNext())
    {
        println(itr.next())
    }
    println("Size Of ArrayList2 = ${arrayList2.size}")

    // Exercise

    var arrayList3 = ArrayList<Double>()
    var sum = 0.0
    for(i in 1..5)
    {
        arrayList3.add(i.toDouble())
        sum += i.toDouble()
    }
    println("Average Is ${sum / arrayList3.size}")


}