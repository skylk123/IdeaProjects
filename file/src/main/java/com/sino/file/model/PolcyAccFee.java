package com.sino.file.model;

import java.util.Date;

public class PolcyAccFee {
    private String costno;

    private String accno;

    private Integer costmoney;

    private Date balancedate;

    private Date paydate;

    private Date modifydate;

    public String getCostno() {
        return costno;
    }

    public void setCostno(String costno) {
        this.costno = costno == null ? null : costno.trim();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public Integer getCostmoney() {
        return costmoney;
    }

    public void setCostmoney(Integer costmoney) {
        this.costmoney = costmoney;
    }

    public Date getBalancedate() {
        return balancedate;
    }

    public void setBalancedate(Date balancedate) {
        this.balancedate = balancedate;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}