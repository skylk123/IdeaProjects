package com.sino.bussniess.entity;

import com.alibaba.fastjson.JSON;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;

import java.util.Date;

public class AccCreatePar {
    @Id
    private String policyno;
    private String productno;
    private String riskcode;
    private String acctype;
    private double money;
    private String operator;
    private String operatorDate;

    public String getPolicyno() {
        return policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorDate() {
        return operatorDate;
    }

    public void setOperatorDate(String operatorDate) {
        this.operatorDate = operatorDate;
    }

    public String getRiskcode() {
        return riskcode;
    }

    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode;
    }

    public static void main(String args[]){
        AccCreatePar t = new AccCreatePar();
        t.setRiskcode("1001");
        t.setAcctype("1");
        t.setPolicyno("10000000000000000001");
        t.setProductno("20000000000000000001");
        t.setMoney(100000);
        t.setOperator("test");
        t.setOperatorDate((new Date()).toString());
        System.out.println(JSON.toJSONString(t));
    }
}
