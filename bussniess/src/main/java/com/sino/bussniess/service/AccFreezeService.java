package com.sino.bussniess.service;

import com.sino.bussniess.entity.AccountFreeze;
import org.springframework.stereotype.Service;

@Service
public interface AccFreezeService {
    public String freezeAcc(AccountFreeze accountFreeze);
    public String unFreezeAcc(AccountFreeze accountFreeze);
}
