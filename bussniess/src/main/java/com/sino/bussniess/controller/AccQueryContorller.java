package com.sino.bussniess.controller;

import com.alibaba.fastjson.JSON;
import com.sino.bussniess.service.AccQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccQueryContorller {
    @Autowired
    private AccQueryService service;

    @RequestMapping("/bussniess/query/policyno")
    public String queryPolicyAcc(@RequestBody String policyno) {
        return JSON.toJSONString(service.queryBypolicyno(policyno));
    }
}