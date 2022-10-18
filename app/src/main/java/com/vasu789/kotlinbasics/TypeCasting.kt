package com.vasu789.kotlinbasics

import android.app.appsearch.StorageInfo
import java.lang.Math.floor

fun main()
{
    val stringList : List<String> = listOf("Vasu", "Frank", "Micheal", "Garry")
    val mixedTypeList :List<Any> = listOf("Vasu", 31, 5, "BDay", 70.5, "Weighs", "Kg")

    for(value in mixedTypeList)
    {
        if(value is Int)
        {
            println("Integer : '$value'")
        }
        else if(value is Double)
        {
            println("Double : '$value' With Floor Value : ${floor(value)}")
        }
        else if(value is String)
        {
            println("String : '$value' Of Length : ${value.length}")
        }
        else
        {
            println("Unknown Type")
        }
    }

    // Alternatively
    for(value in mixedTypeList)
    {
        when(value)
        {
            is Int -> println("Integer : '$value'")
            is Double -> println("Double : '$value' With Floor Value : ${Math.floor(value)}")
            is String -> println("String : '$value' Of Length : ${value.length}")
            else -> println("Unknown Type")
        }
    }

    // Smart Cast
    val obj1: Any = "I Have A Dream"
    if(obj1 !is String)
    {
        println("Not A String")
    }
    else
    {
        println("Found A String Of Length ${obj1.length}")
    }

    // Explicit (Unsafe) Casting Using as Keyword
    val str1 : String = obj1 as String
    println(str1.length)

    val obj2: Any = 1337
    //val str2 : String = obj2 as String
    //println(str2)

    // Explicit (Safe) Csating Using as? Keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String
    println(str3)
}