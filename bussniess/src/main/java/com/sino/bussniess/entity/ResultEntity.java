package com.sino.bussniess.entity;

public class ResultEntity {
    private String succflag;
    private String code;
    private String reason;

    public ResultEntity(String sf, String c, String r) {
        succflag = sf;
        code = c;
        reason = r;
    }

    public String getSuccflag() {
        return succflag;
    }

    public void setSuccflag(String succflag) {
        this.succflag = succflag;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
