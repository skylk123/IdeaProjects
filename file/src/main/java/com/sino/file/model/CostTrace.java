package com.sino.file.model;

import java.util.Date;

public class CostTrace {
    private Long serialno;

    private String businessno;

    private String accno;

    private String costno;

    private String costcode;

    private Integer costmoney;

    private Date makedate;

    private Date costdate;

    public Long getSerialno() {
        return serialno;
    }

    public void setSerialno(Long serialno) {
        this.serialno = serialno;
    }

    public String getBusinessno() {
        return businessno;
    }

    public void setBusinessno(String businessno) {
        this.businessno = businessno == null ? null : businessno.trim();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public String getCostno() {
        return costno;
    }

    public void setCostno(String costno) {
        this.costno = costno == null ? null : costno.trim();
    }

    public String getCostcode() {
        return costcode;
    }

    public void setCostcode(String costcode) {
        this.costcode = costcode == null ? null : costcode.trim();
    }

    public Integer getCostmoney() {
        return costmoney;
    }

    public void setCostmoney(Integer costmoney) {
        this.costmoney = costmoney;
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public Date getCostdate() {
        return costdate;
    }

    public void setCostdate(Date costdate) {
        this.costdate = costdate;
    }
}