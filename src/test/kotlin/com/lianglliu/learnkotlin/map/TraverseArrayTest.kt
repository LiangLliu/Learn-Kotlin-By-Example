package com.lianglliu.learnkotlin.map

import org.junit.jupiter.api.Test

internal class TraverseArrayTest {

    private val list = listOf(
        "1111", "22222", "33333", "44444"
    )

    @Test
    fun should_traverse_array_with_for_each() {
        for (str in list) {
            println(str)
        }
    }

    @Test
    fun should_traverse_array_with_map() {
        list.map {
            println(it)
        }
    }

    @Test
    fun should_traverse_array_with_map_inline() {
        list.map(::println)
    }
}