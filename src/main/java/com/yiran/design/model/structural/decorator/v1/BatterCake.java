package com.yiran.design.model.structural.decorator.v1;

/**
 * Created by Ale on 2021/3/27
 */
public class BatterCake {

    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getDesc(){
       return this.name;
    }

    public int cost(){
        return 8;
    }
}
