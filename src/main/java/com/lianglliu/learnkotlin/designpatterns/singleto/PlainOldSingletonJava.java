package com.lianglliu.learnkotlin.designpatterns.singleto;

public class PlainOldSingletonJava {
    private static final ThreadLocal<PlainOldSingletonJava> INSTANCE = ThreadLocal.withInitial(PlainOldSingletonJava::new);

    private PlainOldSingletonJava() {
        System.out.println("PlainOldSingletonJava");
    }

    public static PlainOldSingletonJava getInstance() {
        return INSTANCE.get();
    }
}
