package com.sino.accconfig.controller;

import com.sino.accconfig.service.AccRateToolService;
import com.sino.entity.parameter.AccRatePar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/conf")
public class AccRateToolController {
    @Autowired
    private AccRateToolService service;

    @RequestMapping(value = "/tool/getRateList")
    public AccRatePar getRateList(@RequestParam String acccode, Date baladate, Date caldate) {
        return service.getRateList(acccode, baladate, caldate);
    }

}
