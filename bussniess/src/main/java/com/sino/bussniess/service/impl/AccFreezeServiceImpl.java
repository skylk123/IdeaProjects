package com.sino.bussniess.service.impl;

import com.sino.bussniess.entity.AccountFreeze;
import com.sino.bussniess.repository.AccountFreezeRepository;
import com.sino.bussniess.service.AccFreezeService;
import org.springframework.beans.factory.annotation.Autowired;

public class AccFreezeServiceImpl implements AccFreezeService {
    @Autowired
    private AccountFreezeRepository repository;
    @Override
    public String freezeAcc(AccountFreeze accountFreeze) {

        try {
            repository.save(accountFreeze);
        }catch (Exception e)
        {
            return "fail";
        }
        return "succ";
    }

    @Override
    public String unFreezeAcc(AccountFreeze accountFreeze) {
        try {
            repository.delete(accountFreeze);
        }catch (Exception e)
        {
            return "fail";
        }
        return "succ";
    }
}
