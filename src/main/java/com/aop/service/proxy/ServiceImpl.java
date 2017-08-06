package com.aop.service.proxy;

/**
 * Created by Administrator on 2017/7/23.
 */
public class ServiceImpl implements Service {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        System.out.println("hi " + name);
        return "afterReturning";
    }
}
