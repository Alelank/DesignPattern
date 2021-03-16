package com.yiran.design.principles.isolation;

/**
 * 企鹅
 * Created by Ale on 2021/2/28
 */
public class Penguin implements ISwimAnimal,IEatAnimal{
    @Override
    public void eat() {
        System.out.println("正在吃东西");
    }

    @Override
    public void swim() {
        System.out.println("正在游泳");
    }
}
