package com.sino.accengin.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@FeignClient(name= "conf")
public interface RelationConfigTool {
    @RequestMapping(value="/conf/tool/getRelation",method = RequestMethod.GET)
    public ArrayList<String> getRelationByRiskcode(@RequestParam("riskcode") String riskcode);
}
