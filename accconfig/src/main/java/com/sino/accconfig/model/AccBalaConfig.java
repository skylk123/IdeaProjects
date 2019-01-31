package com.sino.accconfig.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccBalaConfig {
    private String acccode;

    private String balatype;

    private String balacyc;

    private Date initdate;

    private String ratetype;

    private BigDecimal guaranteedrate;

    public String getAcccode() {
        return acccode;
    }

    public void setAcccode(String acccode) {
        this.acccode = acccode == null ? null : acccode.trim();
    }

    public String getBalatype() {
        return balatype;
    }

    public void setBalatype(String balatype) {
        this.balatype = balatype == null ? null : balatype.trim();
    }

    public String getBalacyc() {
        return balacyc;
    }

    public void setBalacyc(String balacyc) {
        this.balacyc = balacyc == null ? null : balacyc.trim();
    }

    public Date getInitdate() {
        return initdate;
    }

    public void setInitdate(Date initdate) {
        this.initdate = initdate;
    }

    public String getRatetype() {
        return ratetype;
    }

    public void setRatetype(String ratetype) {
        this.ratetype = ratetype == null ? null : ratetype.trim();
    }

    public BigDecimal getGuaranteedrate() {
        return guaranteedrate;
    }

    public void setGuaranteedrate(BigDecimal guaranteedrate) {
        this.guaranteedrate = guaranteedrate;
    }
}