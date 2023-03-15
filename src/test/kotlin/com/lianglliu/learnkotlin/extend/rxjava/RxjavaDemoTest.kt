package com.lianglliu.learnkotlin.extend.rxjava

import org.junit.jupiter.api.Test

internal class RxjavaDemoTest {

    private val rxJavaDemo = RxjavaDemo()

    @Test
    fun should_read_input_file_and_count_char_number() {
        rxJavaDemo.groupByAndSorted()
    }
}