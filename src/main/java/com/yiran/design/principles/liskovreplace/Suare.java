package com.yiran.design.principles.liskovreplace;

/**
 * 正方形
 * Created by Ale on 2021/3/1
 */
public class Suare implements Quadrilateral{
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }
}
