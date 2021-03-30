package com.yiran.design.model.structural.bridge;

/**
 * Created by Ale on 2021/3/30
 */
public class Oppo implements Brand{


    @Override
    public void modify() {
        System.out.println("oppo编辑方案");
    }

    @Override
    public void commit() {
        System.out.println("oppo提交方案");
    }

    @Override
    public void recall() {
        System.out.println("oppo撤回方案");
    }
}
