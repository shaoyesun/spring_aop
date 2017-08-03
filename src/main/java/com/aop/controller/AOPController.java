package com.aop.controller;

import com.aop.service.AOPService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by root on 17-8-3.
 */
@Controller
@RequestMapping(value = "/aop")
public class AOPController {

    @Autowired
    private AOPService aopService;

    @RequestMapping(value = "/hello")
    public String hello() {
        aopService.hello();
        return "index";
    }

}
