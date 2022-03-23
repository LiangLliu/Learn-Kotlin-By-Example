package com.lianglliu.learnkotlin.designpatterns.singleto

class LazyThreadSafeClassInnerObject private constructor() {
    companion object {
        fun getInstance(): LazyThreadSafeClassInnerObject = Holder.INSTANCE
    }

    private object Holder {
        val INSTANCE = LazyThreadSafeClassInnerObject();
    }
}