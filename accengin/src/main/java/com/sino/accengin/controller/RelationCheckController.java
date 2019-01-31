package com.sino.accengin.controller;

import com.sino.accengin.service.RelationCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/engin")
public class RelationCheckController {

    @Autowired
    private RelationCheckService service;
    @RequestMapping(value = "/tool/relationcheck",method = RequestMethod.GET)
    public boolean checkRiskcodeToAccType(@RequestParam("riskcode") String riskcode, @RequestParam("acctype") String acctype)
    {
        System.out.println("engin RelationCheckController has been called");
        return service.checkRiskcodeToAccType(riskcode,acctype);
    }
}
