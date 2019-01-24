package com.sino.bussniess.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "accConfig")
public interface AccConfigTool {
    @RequestMapping(value="/tool/relationcheck")
    public String checkRiskcodeToAccType(@RequestParam("String") String riskcode,String acctype);
}
