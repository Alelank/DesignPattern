package com.yiran.design.model.structural.bridge;

/**
 * 抽象方案
 * Created by Ale on 2021/3/30
 */
public abstract class Plan {
    protected Brand brand;

    public Plan(Brand brand) {
        this.brand = brand;
    }

    protected abstract void modify();

    protected abstract void commit();

    protected abstract void recall();

}
