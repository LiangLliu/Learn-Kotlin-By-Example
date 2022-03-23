package com.lianglliu.learnkotlin.designpatterns.singleto;

/**
 * 静态内部类
 */
public class LazyThreadSafeClassInnerObjectJava {

    private static class Holder {
        private static final LazyThreadSafeClassInnerObjectJava INSTANCE = new LazyThreadSafeClassInnerObjectJava();
    }

    public LazyThreadSafeClassInnerObjectJava() {
        System.out.println("Singleton has loaded");
    }

    public static LazyThreadSafeClassInnerObjectJava getInstance() {
        return Holder.INSTANCE;
    }
}
