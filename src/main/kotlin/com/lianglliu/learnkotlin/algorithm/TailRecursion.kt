package com.lianglliu.learnkotlin.algorithm

import java.math.BigInteger

/**
 * 递归
 */
fun factorial(num: Int): BigInteger {
    if (num <= 1) {
        return BigInteger.valueOf(1L)
    }
    return BigInteger.valueOf(num.toLong()).times(factorial(num - 1))
}

/**
 * 尾递归
 */
class Result(
    var value: BigInteger = BigInteger.valueOf(1L)
)

tailrec fun factorial2(num: Int, result: Result) {
    if (num <= 1) {
        result.value = result.value.times(BigInteger.valueOf(1L))
    } else {
        result.value = result.value.times(BigInteger.valueOf(num.toLong()))
        factorial2(num - 1, result)
    }
}