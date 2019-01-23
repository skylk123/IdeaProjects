package com.sino.bussniess.entity;

import org.springframework.data.annotation.Id;

public class AccountFreeze {
    @Id
    private String accno;
    private double freezeMoney;
    private String busscode;
    private String freezeDate;

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public double getFreezeMoney() {
        return freezeMoney;
    }

    public void setFreezeMoney(double freezeMoney) {
        this.freezeMoney = freezeMoney;
    }

    public String getBusscode() {
        return busscode;
    }

    public void setBusscode(String busscode) {
        this.busscode = busscode;
    }

    public String getFreezeDate() {
        return freezeDate;
    }

    public void setFreezeDate(String freezeDate) {
        this.freezeDate = freezeDate;
    }
}
