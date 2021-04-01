package com.yiran.design.model.behavioral.templatemethod;

/**
 * Created by Ale on 2021/4/1
 */
public class FECourse extends ACourse{
    private boolean isEditorNote = false;
    @Override
    void packageCourse() {
        System.out.println("提供前端课程素材");
    }

    public FECourse(boolean isEditorNote) {
        this.isEditorNote = isEditorNote;
    }

    @Override
    protected boolean isEditorNote() {
        return this.isEditorNote;
    }
}
