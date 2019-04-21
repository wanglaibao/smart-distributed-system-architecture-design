package com.laibao.kotlin.functional.immutability

fun main() {
    val mike = Person("Mike", 31)

    val olderMike = mike.copy(age = 32)


    val people = listOf(mike, olderMike)

    //people.add(Person("Bob", 50))
    val peopleDB = arrayListOf(mike, olderMike)
    peopleDB.add(Person("Bob", 50))

    val view: List<Person> = peopleDB

    val snapshot = peopleDB.toList()

    snapshot.forEach(::println)
}

data class Person(val name: String, val age: Int)




















