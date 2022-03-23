package com.lianglliu.learnkotlin.map

import org.junit.jupiter.api.Test

/**
 * 拍平
 */
internal class FlatMapDemoTest {
    private val arrays: Array<String> = arrayOf("a_b_c_d_e_f", "b_d_c_a", "c_v", "w")

    @Test
    fun should_flat_map_when_given_one_array() {
        arrays.flatMap {
            it.split("_")
        }.map {
            print("$it ")
        }
    }
}
