package com.yiran.design.model.behavioral.templatemethod;

/**
 * 抽象课程类
 * Created by Ale on 2021/4/1
 */
public abstract class ACourse {

    /**
     * 制作课程
     */
    protected final void makeCourse(){
        makePPT();
        makeVideo();
        if(isEditorNote()){
            editorNote();
        }
        packageCourse();
    }

    /**
     * 制作PPT
     */
    protected final void makePPT(){
        System.out.println("制作PPT");
    }

    /**
     * 制作视频
     */
    protected final void makeVideo(){
        System.out.println("制作视频");
    }

    /**
     * 编辑笔记
     */
    protected final void editorNote(){
        System.out.println("编辑笔记");
    }

    abstract void packageCourse();

    protected boolean isEditorNote(){
        return false;
    }
}
