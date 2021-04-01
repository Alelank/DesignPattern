package com.yiran.design.model.structural.proxy.dynamicproxy;
import java.lang.reflect.Proxy;

/**
 * Created by Ale on 2021/3/31
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            classify();
            pack();
            Object invoke = method.invoke(target, args);
            end();
            cost();
            return invoke;
        });
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
