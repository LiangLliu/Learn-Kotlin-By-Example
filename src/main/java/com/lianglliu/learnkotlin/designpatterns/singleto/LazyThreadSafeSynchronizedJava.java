package com.lianglliu.learnkotlin.designpatterns.singleto;

public class LazyThreadSafeSynchronizedJava {
    private static LazyThreadSafeSynchronizedJava INSTANCE;

    public static synchronized LazyThreadSafeSynchronizedJava getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyThreadSafeSynchronizedJava();
        }
        return INSTANCE;
    }
}
