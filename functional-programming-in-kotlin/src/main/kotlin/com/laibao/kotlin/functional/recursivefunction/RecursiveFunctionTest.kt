package com.laibao.kotlin.functional.recursivefunction

import java.lang.Math.cos

fun main() {

}


/**
 * in an imperative fashion
 */
private fun cosFixpoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (x == y) return y
        x = y
    }
}


/**
 * in a recursive fashion
 */

tailrec fun cosFixpoint(x: Double = 1.0): Double {
    val r = Math.cos(x)
    return if (x == r) x else cosFixpoint(r)
}


tailrec fun cosFixpointEXpress(x: Double = 1.0): Double = if (x == cos(x)) x else cosFixpointEXpress(cos(x))






