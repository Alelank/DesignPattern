package com.yiran.design.model.structural.bridge;

/**
 * Created by Ale on 2021/3/30
 */
public class XiaoMi implements Brand{
    @Override
    public void modify() {
        System.out.println("小米开始编辑方案");
    }

    @Override
    public void commit() {
        System.out.println("小米方案提交");
    }

    @Override
    public void recall() {
        System.out.println("小米撤回方案");
    }
}
