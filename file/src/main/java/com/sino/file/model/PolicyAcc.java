package com.sino.file.model;

import java.util.Date;

public class PolicyAcc {
    private String accno;

    private String policyno;

    private String productno;

    private String costno;

    private String acctype;

    private String accstate;

    private Date balancedate;

    private Integer balancemoney;

    private Integer principal;

    private Integer interest;

    private Date createdate;

    private Date destorydate;

    private Date modifydate;

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public String getPolicyno() {
        return policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno == null ? null : policyno.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public String getCostno() {
        return costno;
    }

    public void setCostno(String costno) {
        this.costno = costno == null ? null : costno.trim();
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype == null ? null : acctype.trim();
    }

    public String getAccstate() {
        return accstate;
    }

    public void setAccstate(String accstate) {
        this.accstate = accstate == null ? null : accstate.trim();
    }

    public Date getBalancedate() {
        return balancedate;
    }

    public void setBalancedate(Date balancedate) {
        this.balancedate = balancedate;
    }

    public Integer getBalancemoney() {
        return balancemoney;
    }

    public void setBalancemoney(Integer balancemoney) {
        this.balancemoney = balancemoney;
    }

    public Integer getPrincipal() {
        return principal;
    }

    public void setPrincipal(Integer principal) {
        this.principal = principal;
    }

    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getDestorydate() {
        return destorydate;
    }

    public void setDestorydate(Date destorydate) {
        this.destorydate = destorydate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}