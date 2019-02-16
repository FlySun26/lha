package com.lhxm2.pojo;

import java.io.Serializable;
import java.util.Date;

public class Token implements Serializable {
    private Integer id;

    private Integer uid;

    private String totken;

    private Date uptime;

    private Date exptime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTotken() {
        return totken;
    }

    public void setTotken(String totken) {
        this.totken = totken;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public Date getExptime() {
        return exptime;
    }

    public void setExptime(Date exptime) {
        this.exptime = exptime;
    }
}