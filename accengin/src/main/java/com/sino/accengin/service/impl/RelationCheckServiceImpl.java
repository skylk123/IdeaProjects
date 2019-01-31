package com.sino.accengin.service.impl;

import com.sino.accengin.common.RelationMap;
import com.sino.accengin.remote.RelationConfigTool;
import com.sino.accengin.service.RelationCheckService;
import com.sino.accengin.service.RelationInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationCheckServiceImpl implements RelationCheckService {
    @Autowired
    private RelationInitService service;
    @Override
    public boolean checkRiskcodeToAccType(String riskcode, String acctype) {
        return service.getRelationByRiskcode(riskcode).contains(acctype);
    }
}
