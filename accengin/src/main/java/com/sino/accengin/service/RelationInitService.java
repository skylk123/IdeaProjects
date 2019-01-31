package com.sino.accengin.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public interface RelationInitService {
    public ArrayList<String> getRelationByRiskcode(@RequestParam("String") String riskcode);}
