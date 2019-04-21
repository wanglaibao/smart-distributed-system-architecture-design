package com.laibao.kotlin.functional.algebraicdatatypes


fun main() {
    val j = Maybe.Just(10000)
    println()
    val (i) = j
    println("the value of i is $i")



}

sealed class Maybe <out T>{
    data class Just<T>(val t: T) : Maybe<T>()
    object None : Maybe<Nothing>()
}









