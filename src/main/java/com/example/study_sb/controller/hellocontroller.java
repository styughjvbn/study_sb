package com.example.study_sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    //@RequestMapping(value = "/hello", method = RequestMethod.GET) 고전적인 방법
    @GetMapping("/hello")
    public  String hello(){
    return  "hello world!";
    }

}
