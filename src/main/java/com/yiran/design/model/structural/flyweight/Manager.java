package com.yiran.design.model.structural.flyweight;

/**
 * Created by Ale on 2021/3/29
 */
public class Manager implements Employee {
    private String title = "报告标题";
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(this.reportContent);
    }
}
