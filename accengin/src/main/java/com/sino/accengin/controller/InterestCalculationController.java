package com.sino.accengin.controller;

import com.sino.accengin.entity.AccSignCalPar;
import com.sino.accengin.service.InterestCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/engin")
public class InterestCalculationController {
    @Autowired
    private InterestCalculationService service;
    @RequestMapping("/cal/single")
    public String signleCal(@RequestBody AccSignCalPar par)
    {
        return service.signleCal(par);
    }

}
