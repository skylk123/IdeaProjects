package com.sino.bussniess.service;

import com.sino.bussniess.entity.PolicyAccInfo;
import org.springframework.stereotype.Service;

@Service
public interface AccQueryService {
    public PolicyAccInfo queryBypolicyno(String policyno);
}
