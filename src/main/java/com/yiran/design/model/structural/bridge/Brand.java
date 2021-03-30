package com.yiran.design.model.structural.bridge;

/**
 * 抽象品牌
 * Created by Ale on 2021/3/30
 */
public interface Brand {
    void modify();
    void commit();
    void recall();
}
