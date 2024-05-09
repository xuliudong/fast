package com.example.fast.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public static String hello (){
        System.out.println("hello");
        return "hello";
    }
}
