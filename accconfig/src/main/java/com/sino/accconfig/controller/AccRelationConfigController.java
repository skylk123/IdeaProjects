package com.sino.accconfig.controller;

import com.sino.accconfig.service.AccRelationConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/conf")
public class AccRelationConfigController {
    @Autowired
    AccRelationConfigService service;

    @RequestMapping(value = "/tool/getRelation",method = RequestMethod.GET)
    public ArrayList<String> getRelationByRiskcode(@RequestParam("riskcode") String riskcode) {
        return service.getRelationByRiskcode(riskcode);
    }

}