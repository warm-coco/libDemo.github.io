package com.iflytek.aop.anno;

import org.springframework.stereotype.Component;

@Component("target2")
public class Target2 implements TargetInterface2{
    @Override
    public void method() {
        System.out.println("Target2 running...");
    }
}
