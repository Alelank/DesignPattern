package com.yiran.design.model.creational.singleton.lazy;

/**
 * Created by Ale on 2021/3/17
 */
public class LazyStaticSingleton {

    private LazyStaticSingleton(){}

    private static class InnerClass{
        private static LazyStaticSingleton lazyStaticSingleton = new LazyStaticSingleton();
    }

    public static LazyStaticSingleton getInstance(){
        return InnerClass.lazyStaticSingleton;
    }
}
