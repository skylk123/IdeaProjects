package com.sino.accconfig.service.impl;

import com.sino.accconfig.mapper.AccRateMapper;
import com.sino.accconfig.model.AccRate;
import com.sino.accconfig.model.AccRateExample;
import com.sino.accconfig.service.AccRateToolService;
import com.sino.entity.parameter.AccRateLine;
import com.sino.entity.parameter.AccRatePar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class AccRateToolServiceImpl implements AccRateToolService {
    @Autowired
    private AccRateMapper mapper;
    @Override
    public AccRatePar getRateList(String acccode, Date baladate, Date caldate) {
        AccRatePar acc = new AccRatePar();
        AccRateExample epl = new AccRateExample();
        AccRateExample.Criteria cri = epl.createCriteria();
        cri.andAcccodeEqualTo(acccode);
        cri.andStartdateLessThanOrEqualTo(baladate);
        cri.andStartdateLessThanOrEqualTo(caldate);
        cri.andEnddateGreaterThanOrEqualTo(baladate);
        cri.andEnddateGreaterThanOrEqualTo(caldate);
        List<AccRate> map = mapper.selectByExample(epl);
        acc.setAcccode(acccode);
        acc.setBaladate(baladate);
        acc.setCaldate(caldate);
        map.forEach(rate ->{
            AccRateLine line = new AccRateLine();
            line.setStartdate(rate.getStartdate());
            line.setEnddate(rate.getEnddate());
            line.setRate(rate.getRate());
            line.setGurrate(rate.getGuaranteedrate());
        });


        return null;
    }
}
