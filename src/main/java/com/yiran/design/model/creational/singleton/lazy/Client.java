package com.yiran.design.model.creational.singleton.lazy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Currency;

/**
 * Created by Ale on 2021/3/17
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton instance = LazySingleton.getInstance();
//        System.out.println(instance);
//        Thread thread = new Thread(new MyThread());
//        Thread thread2 = new Thread(new MyThread());
//        thread.start();
//        thread2.start();
//        System.out.println("线程");


//         饿汉模式-序列化测试
//        HungrySingleton outInstance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hungry_singleton_file"));
//        oos.writeObject(outInstance);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("hungry_singleton_file")));
//        HungrySingleton readInstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(outInstance);
//        System.out.println(readInstance);
//
//        System.out.println(outInstance == readInstance);

//        饿汉单例模式防止反射
//        Class objClass = HungrySingleton.class;
//
//        Constructor constructor = objClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//
//        HungrySingleton instance = HungrySingleton.getInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(newInstance == instance);


    }
}
