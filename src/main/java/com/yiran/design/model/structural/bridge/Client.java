package com.yiran.design.model.structural.bridge;

/**
 * Created by Ale on 2021/3/30
 */
public class Client {
    public static void main(String[] args) {
        Plan bridgePlan = new BridgePlan(new HuaWei());
        bridgePlan.modify();
        bridgePlan.commit();
        bridgePlan.recall();


        Plan metroPlan = new MetroPlan(new HuaWei());
        metroPlan.modify();
        metroPlan.commit();
        metroPlan.recall();


        Plan plan = new BridgePlan(new XiaoMi());
        plan.modify();
        plan.commit();
        plan.recall();
    }
}
