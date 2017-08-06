package com.aop.service.proxy;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/7/23.
 */
public class MyAdvice implements MethodBeforeAdvice, AfterReturningAdvice {
    public void before(Method method, Object[] args, Object o) throws Throwable {
        System.out.println("before:" + method.getName() + "　" + args.length);
    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("afterReturning:" + o + " " + method.getName() + " " + objects + " " + o1);
    }

}
