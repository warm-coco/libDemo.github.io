package com.iflytek.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class Target implements TargetInterface{

    @Override
    public void method() {
        System.out.println("Target running.....");
    }

    public static void main(String[] args) {
        Target target = new Target();//创建对象
        //创建代理对象
        TargetInterface proxy =  (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("前置代码增强");
                Object invoke = method.invoke(target,args);
                System.out.println("后置代码增强");
                return invoke;
            }
        }
        );
        proxy.method();

    }
}
