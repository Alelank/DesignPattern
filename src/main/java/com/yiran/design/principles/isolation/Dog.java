package com.yiran.design.principles.isolation;

/**
 * 狗
 * Created by Ale on 2021/2/28
 */
public class Dog implements IEatAnimal, ISwimAnimal {
    @Override
    public void eat() {
        System.out.println("正在吃东西...");
    }

    @Override
    public void swim() {
        System.out.println("正在游泳...");
    }
}
