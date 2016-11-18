package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String helloWorld(Model m)
    {
        m.addAttribute("hello", "Hello World!");
        return "hello";
    }
}