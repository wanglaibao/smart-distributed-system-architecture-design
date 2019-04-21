package com.laibao.kotlin.functional.algebraicdatatypes

fun main() {
    val alice = Pet("Alice", 6)
    val (name, age) = alice
    println("the name is $name and the age is $age")

    printUser("金戈")
}

data class Pet(val name: String, val age: Int)


class User(val age: Int)

fun lookupFromDB(str: String): Maybe<User> = Maybe.Just(User(1000))

fun printUser(username: String) {
    val rec = lookupFromDB(username)
    when (rec) {
        is Maybe.None -> println("not found")
        is Maybe.Just<User> -> println("${rec.t.age} years old")
    }
}