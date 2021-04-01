package com.yiran.design.model.structural.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Ale on 2021/3/31
 */
public class ProxyFactory implements MethodInterceptor {


    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        classify();
        pack();
        Object invoke = method.invoke(target, objects);
        end();
        cost();
        return invoke;
    }


    protected void classify() {
        System.out.println("分类....");
    }


    protected void pack() {
        System.out.println("打包....");
    }

    protected void end() {
        System.out.println("结束....");
    }


    protected void cost() {
        System.out.println("费用结算");
    }
}
