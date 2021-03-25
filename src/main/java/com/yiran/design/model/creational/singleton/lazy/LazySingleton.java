package com.yiran.design.model.creational.singleton.lazy;

/**
 * 单例模式之懒汉式&双重检查锁模式
 * Created by Ale on 2021/3/9
 */
public class LazySingleton {
    private volatile static LazySingleton lazySingleton;
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == lazySingleton) {
            synchronized (LazySingleton.class) {
                if (null == lazySingleton) {
                    // 对象的创建过程
                    // 1、分配内存空间
                    // 2、初始化对象
                    // 3、添加指针指向内存地址
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
