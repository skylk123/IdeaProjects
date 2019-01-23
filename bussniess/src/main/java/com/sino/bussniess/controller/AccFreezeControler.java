package com.sino.bussniess.controller;

import com.sino.bussniess.entity.AccountFreeze;
import com.sino.bussniess.service.AccFreezeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AccFreezeControler {
    @Autowired
    private AccFreezeService accFreezeService;

    @RequestMapping("/bussniess/freeze/done")
    public String freezeeAcc(@RequestBody AccountFreeze accountFreeze) {
        return accFreezeService.freezeAcc(accountFreeze);
    }

    @RequestMapping("/bussniess/freeze/undo")
    public String unFreezeeAcc(@RequestBody AccountFreeze accountFreeze) {
        return accFreezeService.unFreezeAcc(accountFreeze);
    }
}
