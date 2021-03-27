package com.yiran.design.model.structural.adapter;

/**
 * Created by Ale on 2021/3/27
 */
public class PowerAdapter implements IDC5{

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC() {
        int inputPower = ac220.outputAC220();
        int outputDC = inputPower / 44;
        System.out.println("输入电源电压：" + inputPower + "，适配直流电压为：" + outputDC);
        return outputDC;
    }
}
