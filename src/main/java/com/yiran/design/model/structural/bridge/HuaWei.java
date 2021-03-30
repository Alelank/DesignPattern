package com.yiran.design.model.structural.bridge;

/**
 * Created by Ale on 2021/3/30
 */
public class HuaWei implements Brand{
    @Override
    public void modify() {
        System.out.println("华为编辑方案");
    }

    @Override
    public void commit() {
        System.out.println("华为提交方案");
    }

    @Override
    public void recall() {
        System.out.println("华为撤回方案");
    }
}
