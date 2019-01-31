package com.sino.bussniess.remote;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "acc-engin")
public interface AccConfigTool {
    @RequestMapping(value="/engin/tool/relationcheck",method = RequestMethod.GET)
    public boolean checkRiskcodeToAccType(@RequestParam("riskcode") String riskcode,@RequestParam("acctype") String acctype);
}
