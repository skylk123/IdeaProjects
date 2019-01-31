package com.sino.bussniess.service.impl;

import com.sino.bussniess.repository.PolicyAccInfoRepository;
import com.sino.bussniess.service.AccGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccGetServiceImpl implements AccGetService {
    @Autowired
    private PolicyAccInfoRepository policy;
    @Override
    public String getAccByProductNo() {


        return null;
    }
}
