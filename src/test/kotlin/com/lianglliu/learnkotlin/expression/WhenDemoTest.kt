package com.lianglliu.learnkotlin.expression

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WhenDemoTest {

    @Test
    fun should_return_english() {
        val lang = Lang.parse("english")
        assertEquals("ENGLISH", lang.toString())
    }

    @Test
    fun should_return_english_hello() {
        val lang = Lang.parse("english")
        assertEquals("hello", lang.sayHello())
    }

    @Test
    fun should_return_chinese_hello() {
        val lang = Lang.parse("chinese")
        assertEquals("您好", lang.sayHello())
    }

    @Test
    fun should_return_japanese_hello() {
        val lang = Lang.parse("japanese")
        assertEquals("こんにちは", lang.sayHello())
    }
}

