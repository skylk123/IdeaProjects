package com.sino.accengin.common;

import com.sino.accengin.remote.RelationConfigTool;
import com.sino.accengin.service.impl.RelationInitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import java.util.ArrayList;
import java.util.HashMap;

public class RelationMap {
    public static HashMap<String, ArrayList<String>> accRelation = new HashMap<String, ArrayList<String>>();

    public static ArrayList<String> getRelationByRiskAcc(String riskcode) {
        ArrayList<String> res = new ArrayList<String>();
        if (accRelation.get(riskcode) == null) {
            RelationInitServiceImpl t = new RelationInitServiceImpl();
            initRelation(riskcode, t.getRelationByRiskcode(riskcode));
        }
        return accRelation.get(riskcode);
    }

    public static void initRelation(String riskcode, ArrayList<String> acclist) {
        accRelation.put(riskcode, acclist);
    }
}
