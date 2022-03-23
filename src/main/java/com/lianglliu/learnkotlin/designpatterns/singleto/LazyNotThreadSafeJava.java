package com.lianglliu.learnkotlin.designpatterns.singleto;

public class LazyNotThreadSafeJava {
    private static LazyNotThreadSafeJava INSTANCE;

    public static LazyNotThreadSafeJava getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyNotThreadSafeJava();
        }
        return INSTANCE;
    }
}
