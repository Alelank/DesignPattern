package com.yiran.design.principles.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ale on 2021/2/28
 */
public class TeamLeader {

    /**
     * 检查在售的车辆数量
     */
    public void checkCarNumber(){
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            cars.add(new Car());
        }
        System.out.println("在售车辆的数量：" + cars.size() + "辆");
    }
}
