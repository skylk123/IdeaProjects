package com.sino.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloTest {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello()
    {

        System.out.println("test hello here ");
        return "hello world";
    }
}
