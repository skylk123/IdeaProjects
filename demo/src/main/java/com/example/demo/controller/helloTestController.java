package com.example.demo.controller;

import com.example.demo.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class helloTestController {
    @Autowired
    private HelloRemote remote;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hellotest()
    {
        System.out.println("has been called here ");
        return remote.hello();
    }
}
