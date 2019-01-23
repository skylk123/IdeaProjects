package com.sino.bussniess.controller;

import com.sino.bussniess.common.ResultTool;
import com.sino.bussniess.entity.PolicyAccInfo;
import com.sino.bussniess.repository.PolicyAccInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccSyncContorller {
    @Autowired
    private PolicyAccInfoRepository rep;
    @RequestMapping(value="/bussniess/sync/policy", method = RequestMethod.GET,produces="application/json;charset=UTF-8")
    public String synoProlicyAcc(@RequestBody PolicyAccInfo policy){

        rep.save(policy);
        return ResultTool.succ("同步成功");
    }

}
