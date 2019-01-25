package com.sino.accconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("accConfig")
public class AccRelationConfigController {

    @RequestMapping(value="/tool/getRelation")
    public String getRelationByRiskcode(@RequestParam() String riskcode )
    {
        return null;
    }

}
