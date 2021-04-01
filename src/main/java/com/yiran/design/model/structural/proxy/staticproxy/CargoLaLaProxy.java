package com.yiran.design.model.structural.proxy.staticproxy;

/**
 * Created by Ale on 2021/3/30
 */
public class CargoLaLaProxy implements IFurniture{

    private IFurniture iFurniture;

    public CargoLaLaProxy(IFurniture iFurniture) {
        this.iFurniture = iFurniture;
    }

    @Override
    public void move() {
        classify();
        pack();
        iFurniture.move();
        end();
        cost();
    }

    protected void classify(){
        System.out.println("分类....");
    }


    protected void pack(){
        System.out.println("打包....");
    }

    protected void end(){
        System.out.println("结束....");
    }


    protected void cost(){
        System.out.println("费用结算");
    }

}
