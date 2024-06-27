package com.iflytek.aop.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAspect2")
@Aspect
public class MyAspect2 {
    @Before("execution(* com.iflytek.aop.anno.*.*(..))")
    public void before(){
        System.out.println("前置增强处理...");
    }
}
