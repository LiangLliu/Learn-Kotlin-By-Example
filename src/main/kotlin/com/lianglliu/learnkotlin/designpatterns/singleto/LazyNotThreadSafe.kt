package com.lianglliu.learnkotlin.designpatterns.singleto

class LazyNotThreadSafe {
    /**
     * kotlin中写法
     */
    companion object {
        val instance by lazy(LazyThreadSafetyMode.NONE) {
            LazyNotThreadSafe()
        }
    }

    /**
     * 仿照Java写法
     */
    private var instance: LazyNotThreadSafe? = null

    fun getInstance(): LazyNotThreadSafe {
        if (instance == null) {
            instance = LazyNotThreadSafe()
        }
        return instance!!
    }
}