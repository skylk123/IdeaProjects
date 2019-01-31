package com.sino.entity.parameter;

import java.util.ArrayList;
import java.util.Date;

public class AccRatePar {
    private String acccode;
    private Date baladate;
    private Date caldate;
    private Date startdate;
    private ArrayList<AccRateLine> ratelists;

    public String getAcccode() {
        return acccode;
    }

    public void setAcccode(String acccode) {
        this.acccode = acccode;
    }

    public Date getBaladate() {
        return baladate;
    }

    public void setBaladate(Date baladate) {
        this.baladate = baladate;
    }

    public Date getCaldate() {
        return caldate;
    }

    public void setCaldate(Date caldate) {
        this.caldate = caldate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public ArrayList<AccRateLine> getRatelists() {
        return ratelists;
    }

    public void setRatelists(ArrayList<AccRateLine> ratelists) {
        this.ratelists = ratelists;
    }
}
