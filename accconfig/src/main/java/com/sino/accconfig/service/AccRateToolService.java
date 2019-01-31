package com.sino.accconfig.service;

import com.sino.entity.parameter.AccRatePar;

import java.util.Date;

public interface AccRateToolService {
    public AccRatePar getRateList(String acccode, Date baladate, Date caldate);
}
