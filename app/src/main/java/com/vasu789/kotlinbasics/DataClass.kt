package com.vasu789.kotlinbasics

data class User(val id: Long, val name: String)


 fun main(args: Array<String>) {
    val user = User(1, "Denis")

    // Getting a property
    val name = user.name

    // Setting a Property

    // You cannot set read-only properties
    //user.id = 2	// Error: Val cannot be assigned

    val user1 = User(1, "Denis")
    val user2 = User(1, "Denis")

    println(user1.equals(user2))  // Prints true
    // You can also use Kotlin’s Structural equality operator == to check for equality. The == operator internally calls the equals() method -
    println(user1 == user) // Prints true

    // Dataclasses have a toString Method
    println("User Details : $user") // Prints User(1,"Denis")

    // Using the copy() Method
    // Copies the user object into a separate Object
    // and updates the name.
    // The advanteg is, that the existing user object remains unchanged.

    val updatedUser = user.copy(name = "Denis Panjuta")
    println("User : $user")
    println("Updated User : $updatedUser")

    // Deconstructing Data Classes
    val user3 = User(3, "Frank")

    println(user3.component1()) // Prints 3
    println(user3.component2()) // Prints "Frank"

    val (id, name1) = user
    println("id = $id, name = $name1") // Prints "id = 3, name = Frank"
}