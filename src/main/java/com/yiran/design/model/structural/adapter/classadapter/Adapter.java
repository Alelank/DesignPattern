package com.yiran.design.model.structural.adapter.classadapter;

/**
 * Created by Ale on 2021/3/27
 */
public class Adapter extends Adapted implements ITarget{
    @Override
    public void request() {
        super.adaptedRequest();
    }
}
