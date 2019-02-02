package com.sino.bussniess.controller;

import com.sino.bussniess.service.AccCreateService;
import com.sino.entity.parameter.AccCreatePar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccCreateContorller {
    @Autowired
    private AccCreateService service;
    @RequestMapping(value = "/bussniess/create",method = RequestMethod.POST)
    public String createAcc(@RequestBody AccCreatePar par)
    {
        return service.accCreate(par);
    }
}
