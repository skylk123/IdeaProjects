package com.sino.entity.parameter;

import java.math.BigDecimal;
import java.util.Date;

public class AccRateLine {
    private Date startdate;
    private Date enddate;
    private BigDecimal rate;
    private BigDecimal gurrate;/*保障利率*/

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getGurrate() {
        return gurrate;
    }

    public void setGurrate(BigDecimal gurrate) {
        this.gurrate = gurrate;
    }
}
