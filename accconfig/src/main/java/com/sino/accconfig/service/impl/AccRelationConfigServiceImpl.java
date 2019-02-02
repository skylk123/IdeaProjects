package com.sino.accconfig.service.impl;

import com.sino.accconfig.mapper.AccDefinitionMapper;
import com.sino.accconfig.model.AccDefinition;
import com.sino.accconfig.model.AccDefinitionExample;
import com.sino.accconfig.service.AccRelationConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccRelationConfigServiceImpl implements AccRelationConfigService {

    @Autowired
    private AccDefinitionMapper tmap;

    @Override
    public ArrayList<String> getRelationByRiskcode(String riskcode) {
        AccDefinitionExample example = new AccDefinitionExample();
        example.createCriteria().andRiskcodeEqualTo(riskcode);
        List<AccDefinition> list = tmap.selectByExample(example);
        ArrayList<String> acclist = new ArrayList<String>();
        list.forEach(a -> {
            acclist.add(a.getAcctype());
        });
        return acclist;
    }
}
