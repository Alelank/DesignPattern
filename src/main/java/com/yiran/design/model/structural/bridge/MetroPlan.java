package com.yiran.design.model.structural.bridge;

/**
 * Created by Ale on 2021/3/30
 */
public class MetroPlan extends Plan{
    public MetroPlan(Brand brand) {
        super(brand);
    }

    @Override
    protected void modify() {
        System.out.println("地铁方案策划");
        super.brand.modify();
    }

    @Override
    protected void commit() {
        System.out.println("地铁方案提交");
        super.brand.commit();
    }

    @Override
    protected void recall() {
        System.out.println("地铁方案撤回");
        super.brand.recall();
    }
}
