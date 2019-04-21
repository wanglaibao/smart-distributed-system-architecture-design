package com.laibao.kotlin.functional.lazyness

import java.math.BigInteger
import java.util.stream.Stream
import kotlin.streams.toList
import kotlin.system.measureTimeMillis

fun main() {
    repeat(3) {
        val time1 = measureTimeMillis {
            primes(100000)
        }
        println("Took $time1 msec")
    }


    repeat(3) {
        val time2 = measureTimeMillis {
            primesParallel(100000)
        }
        println("Took $time2 msec")
    }
}


val ONE = BigInteger.ONE

fun primes(n: Long) = Stream.iterate(ONE) { it + ONE }.
                            filter { it.isProbablePrime(16) }.
                            limit(n).
                            toList()




fun primesParallel(n: Long) = Stream.iterate(ONE) { it + ONE }
                                    .parallel()
                                    .filter { it.isProbablePrime(16) }
                                    .limit(n)
                                    .toList()