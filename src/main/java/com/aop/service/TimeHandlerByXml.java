package com.aop.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 通过配置xml实现代理
 */
public class TimeHandlerByXml {

    //before增强处理
    public void before(JoinPoint jp) {
        System.out.println("before CurrentTime = " + System.currentTimeMillis() + " " + jp.getTarget());
    }

    //after增强处理
    public void after(JoinPoint jp) {
        System.out.println("after CurrentTime = " + System.currentTimeMillis() + " " + jp.getTarget());
    }

    //afterReturning增强处理
    public void afterReturning(JoinPoint jp, Object obj) {
        System.out.println("afterReturning CurrentTime = " + System.currentTimeMillis() + " " + jp.getTarget() + " " + obj);
    }

    //afterThrowing增强处理
    public void afterThrowing(Throwable ex) {
        System.out.println("afterThrowing CurrentTime = " + System.currentTimeMillis() + " " + ex);
    }

    //around增强处理
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before CurrentTime = " + System.currentTimeMillis() + " " + joinPoint.getTarget());
        Object[] args = joinPoint.getArgs();
        Object object = joinPoint.proceed(args);
        System.out.println("around after CurrentTime = " + System.currentTimeMillis() + " " + joinPoint.getTarget());
        return object;
    }

}
