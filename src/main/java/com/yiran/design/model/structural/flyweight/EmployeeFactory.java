package com.yiran.design.model.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ale on 2021/3/29
 */
public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    public static final Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if(null == manager) {
            manager = new Manager(department);
            System.out.println("创建" + department + "部门经理报告.");
            String reportContent = department +"部门经理报告，内容：.....";
            manager.setReportContent(reportContent);
            manager.report();
            EMPLOYEE_MAP.put(department,manager);

        }
        return manager;
    }
}
