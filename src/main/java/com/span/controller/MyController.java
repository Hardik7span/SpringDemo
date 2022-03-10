package com.span.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello , there");
        return "Hi Folks";
    }
}
