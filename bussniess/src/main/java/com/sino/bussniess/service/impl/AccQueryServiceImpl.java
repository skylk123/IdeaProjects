package com.sino.bussniess.service.impl;

import com.sino.bussniess.entity.PolicyAccInfo;
import com.sino.bussniess.repository.PolicyAccInfoRepository;
import com.sino.bussniess.service.AccQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccQueryServiceImpl implements AccQueryService {
    @Autowired
    private PolicyAccInfoRepository rep;

    @Override
    public PolicyAccInfo queryBypolicyno(String policyno) {

        return rep.findPolicyAccInfoByContno(policyno);
    }
}
