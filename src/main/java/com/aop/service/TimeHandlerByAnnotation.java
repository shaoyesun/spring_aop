package com.aop.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 通过annotation实现代理
 */
@Component
@Aspect
public class TimeHandlerByAnnotation {

    //before增强处理
    @Before("execution(* com.aop.service.*.*(..))")
    public void before(JoinPoint jp) {
        System.out.println("before CurrentTime = " + System.currentTimeMillis() + " " + jp.getTarget());
    }

    //after增强处理
    @After("execution(* com.aop.service.*.*(..))")
    public void after(JoinPoint jp) {
        System.out.println("after CurrentTime = " + System.currentTimeMillis() + " " + jp.getTarget());
    }

    //afterReturning增强处理
    @AfterReturning(returning = "obj", pointcut = "execution(* com.aop.service.*.*(..))")
    public void afterReturning(JoinPoint jp, Object obj) {
        System.out.println("afterReturning CurrentTime = " + System.currentTimeMillis() + " " + jp.getTarget() + " " + obj);
    }

    //afterThrowing增强处理
    @AfterThrowing(throwing = "ex", pointcut = "execution(* com.aop.service.*.*(..))")
    public void afterThrowing(Throwable ex) {
        System.out.println("afterThrowing CurrentTime = " + System.currentTimeMillis() + " " + ex);
    }

    //around增强处理
    @Around("execution(* com.aop.service.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before CurrentTime = " + System.currentTimeMillis() + " " + joinPoint.getTarget());
        Object[] args = joinPoint.getArgs();
        Object object = joinPoint.proceed(args);
        System.out.println("around after CurrentTime = " + System.currentTimeMillis() + " " + joinPoint.getTarget());
        return object;
    }

}
