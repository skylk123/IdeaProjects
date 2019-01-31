package com.example.demo.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name= "test")
public interface HelloRemote {
    @RequestMapping(value = "/test/hello",method = RequestMethod.GET)
    public String hello();
}
