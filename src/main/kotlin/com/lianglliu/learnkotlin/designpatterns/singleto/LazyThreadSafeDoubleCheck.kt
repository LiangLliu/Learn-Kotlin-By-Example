package com.lianglliu.learnkotlin.designpatterns.singleto

class LazyThreadSafeDoubleCheck {
    companion object {
        val instance by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            LazyThreadSafeDoubleCheck()
        }
    }
}