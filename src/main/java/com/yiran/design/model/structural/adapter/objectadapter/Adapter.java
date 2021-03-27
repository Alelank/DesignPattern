package com.yiran.design.model.structural.adapter.objectadapter;

/**
 * Created by Ale on 2021/3/27
 */
public class Adapter  implements ITarget {
    private Adapted adapted = new Adapted();
    @Override
    public void request() {
        adapted.adaptedRequest();
    }
}
