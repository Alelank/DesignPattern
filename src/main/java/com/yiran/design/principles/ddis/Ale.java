package com.yiran.design.principles.ddis;

/**
 * Created by Ale on 2021/2/27
 */
public class Ale {
    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study(){
        this.course.studyCourse();
    }
}
