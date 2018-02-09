package com.aop.controller;

import com.aop.service.AOPService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by root on 17-8-3.
 */
@Controller
@RequestMapping(value = "/aop")
public class AOPController {

    @Autowired
    private AOPService aopService;

    @RequestMapping(value = "/hello")
    public String hello(HttpServletRequest req, Model model) {
        aopService.hello();
        req.setAttribute("result", "success");
        model.addAttribute("model", "model");
        return "index";
    }

    @RequestMapping(value = "/hello1")
    public String hello1() {
        aopService.hello();
        return "index";
    }

}
