package com.sino.file.model;

import java.util.Date;

public class BusinessFile {
    private String businessno;

    private String accno;

    private String operattype;

    private Integer money;

    private String operator;

    private Date makedate;

    private String chel;

    private Date filedate;

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

    public String getOperattype() {
        return operattype;
    }

    public void setOperattype(String operattype) {
        this.operattype = operattype == null ? null : operattype.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public String getChel() {
        return chel;
    }

    public void setChel(String chel) {
        this.chel = chel == null ? null : chel.trim();
    }

    public Date getFiledate() {
        return filedate;
    }

    public void setFiledate(Date filedate) {
        this.filedate = filedate;
    }
}