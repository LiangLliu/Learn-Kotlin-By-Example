package com.lianglliu.learnkotlin.algorithm

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.math.BigInteger

internal class TailRecursionTest {
    @Test
    fun should_calculate_factorial_when_given_one_number() {
        assertEquals(BigInteger.valueOf(120L), factorial(5))
    }

    @Test
    fun should_calculate_factorial_with_tailrec() {
        val result = Result()
        factorial2(5, result)
        println(result.value)
        assertEquals(BigInteger.valueOf(120L), factorial(5))

        val result1 = Result()
        factorial2(100000, result1)
        println(result1.value)
    }

}