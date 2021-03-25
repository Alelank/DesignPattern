package com.yiran.design.model.creational.singleton.lazy;

import sun.awt.image.PixelConverter;

/**
 * Created by Ale on 2021/3/17
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
        LazyStaticSingleton instance = LazyStaticSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " -- " + PixelConverter.UshortGray.instance);
    }
}
