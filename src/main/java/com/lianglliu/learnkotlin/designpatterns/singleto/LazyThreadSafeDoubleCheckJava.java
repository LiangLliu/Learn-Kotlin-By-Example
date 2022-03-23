package com.lianglliu.learnkotlin.designpatterns.singleto;

/**
 * volatile 双重校验锁
 */
public class LazyThreadSafeDoubleCheckJava {
    private static volatile LazyThreadSafeDoubleCheckJava instance;

    private LazyThreadSafeDoubleCheckJava() {
    }

    public static LazyThreadSafeDoubleCheckJava getInstance() {
        if (instance == null) {
            synchronized (LazyThreadSafeDoubleCheckJava.class) {
                if (instance == null) {
                    instance = new LazyThreadSafeDoubleCheckJava();
                }
            }
        }
        return instance;
    }
}
