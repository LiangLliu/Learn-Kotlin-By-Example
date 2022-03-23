package com.lianglliu.learnkotlin.designpatterns.singleto

class LazyThreadSafeSynchronized {

    companion object {
        private var instance: LazyThreadSafeSynchronized? = null

        @Synchronized
        fun getInstance(): LazyThreadSafeSynchronized {
            if (instance == null) {
                instance = LazyThreadSafeSynchronized()
            }
            return instance!!
        }
    }

}