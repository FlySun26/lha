package com.lhxm2.pojo;

import java.io.Serializable;
import java.util.Date;

public class ZbPinglun implements Serializable {
    private Integer zpId;

    private Integer uId;

    private Integer zbId;

    private Integer zpUpid;

    private String zpText;

    private Date zpTime;

    private static final long serialVersionUID = 1L;

    public Integer getZpId() {
        return zpId;
    }

    public void setZpId(Integer zpId) {
        this.zpId = zpId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getZbId() {
        return zbId;
    }

    public void setZbId(Integer zbId) {
        this.zbId = zbId;
    }

    public Integer getZpUpid() {
        return zpUpid;
    }

    public void setZpUpid(Integer zpUpid) {
        this.zpUpid = zpUpid;
    }

    public String getZpText() {
        return zpText;
    }

    public void setZpText(String zpText) {
        this.zpText = zpText;
    }

    public Date getZpTime() {
        return zpTime;
    }

    public void setZpTime(Date zpTime) {
        this.zpTime = zpTime;
    }
}