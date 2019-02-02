package com.sino.accengin.service.impl;

import com.sino.accengin.remote.RelationConfigTool;
import com.sino.accengin.service.RelationInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class RelationInitServiceImpl implements RelationInitService {
    @Autowired
    private RelationConfigTool tool;
    @Override
    @Cacheable(value = "accrelation",key = "'riskcode'+ #riskcode")
    public ArrayList<String> getRelationByRiskcode(String riskcode) {

        System.out.println("这个有问题？");
        return tool.getRelationByRiskcode(riskcode);
    }
}
