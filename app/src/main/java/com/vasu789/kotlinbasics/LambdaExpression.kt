package com.vasu789.kotlinbasics

fun main()
{
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a+b}
    println(sum(10, 5))

    val sumPrint = {a:Int, b:Int -> println(a+b)}
    sumPrint(10, 5)
}