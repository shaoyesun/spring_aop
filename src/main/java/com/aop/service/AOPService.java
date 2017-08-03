package com.aop.service;

import org.springframework.stereotype.Service;

/**
 * Created by root on 17-8-3.
 */
@Service
public class AOPService {

    public String hello() {
        System.out.println("hello");
        //int x = 1/0;
        return "after-returning";
    }

}
