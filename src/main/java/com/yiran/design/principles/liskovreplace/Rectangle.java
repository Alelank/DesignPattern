package com.yiran.design.principles.liskovreplace;

/**
 * 长方形
 * Created by Ale on 2021/2/28
 */
public class Rectangle implements Quadrilateral{
    private long length;
    private long width;


    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
