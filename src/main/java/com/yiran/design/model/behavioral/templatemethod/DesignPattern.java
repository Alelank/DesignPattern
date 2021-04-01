package com.yiran.design.model.behavioral.templatemethod;

/**
 * Created by Ale on 2021/4/1
 */
public class DesignPattern extends ACourse{


    @Override
    void packageCourse() {
        System.out.println("提供设计模式课程源代码");
    }

    @Override
    protected boolean isEditorNote() {
        return true;
    }
}
