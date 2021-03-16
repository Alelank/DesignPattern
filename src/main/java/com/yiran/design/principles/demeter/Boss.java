package com.yiran.design.principles.demeter;

/**
 * Created by Ale on 2021/2/28
 */
public class Boss {
    /**
     * 检查在售车的数量指令
     */
    public void checkCarNumberCommand(TeamLeader teamLeader){
        teamLeader.checkCarNumber();
    }
}
