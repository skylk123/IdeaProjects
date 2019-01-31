package com.sino.accconfig.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccRate {
    private Long serialno;

    private String acccode;

    private BigDecimal rate;

    private Date startdate;

    private String balacyc;

    private Date enddate;

    private Date makedate;

    private BigDecimal guaranteedrate;

    public Long getSerialno() {
        return serialno;
    }

    public void setSerialno(Long serialno) {
        this.serialno = serialno;
    }

    public String getAcccode() {
        return acccode;
    }

    public void setAcccode(String acccode) {
        this.acccode = acccode == null ? null : acccode.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getBalacyc() {
        return balacyc;
    }

    public void setBalacyc(String balacyc) {
        this.balacyc = balacyc == null ? null : balacyc.trim();
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public BigDecimal getGuaranteedrate() {
        return guaranteedrate;
    }

    public void setGuaranteedrate(BigDecimal guaranteedrate) {
        this.guaranteedrate = guaranteedrate;
    }
}