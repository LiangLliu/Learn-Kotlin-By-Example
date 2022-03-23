package com.lianglliu.learnkotlin

class ReflectDemo {
    fun demo() {
        Person::class.constructors.map {
            println(it)
        }
    }
}