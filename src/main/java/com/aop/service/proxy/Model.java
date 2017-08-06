package com.aop.service.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 配置代理的方式实现aop
 */
public class Model {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service ts = (Service) ac.getBean("proxyFactoryBean");
        ts.sayHello();
    }
}
