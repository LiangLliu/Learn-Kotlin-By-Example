package com.lianglliu.learnkotlin.expression

enum class Lang(val hello: String) {
    ENGLISH("hello"),
    CHINESE("您好"),
    JAPANESE("こんにちは"),
    KOREAN("안녕하세요");

    /**
     * 半生对象，方法与类一一对应
     */
    companion object {
        fun parse(name: String): Lang {
            return valueOf(name.uppercase())
        }
    }
}

/**
 * 扩展方法
 */
fun Lang.sayHello(): String {
    return when (this) {
        Lang.ENGLISH -> "hello"
        Lang.CHINESE -> "您好"
        Lang.JAPANESE -> "こんにちは"
        Lang.KOREAN -> "안녕하세요"
    }
}
