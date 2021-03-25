package com.yiran.design.model.creational.singleton.hungry;

/**
 * 线程单例  单个线程里面无论多少实例都是同一个实例
 * Created by Ale on 2021/3/25
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){

    }

    public static ThreadLocalSingleton getInstance(){
        return THREAD_LOCAL.get();
    }

}
