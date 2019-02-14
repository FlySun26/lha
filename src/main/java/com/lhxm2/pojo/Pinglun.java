package com.lhxm2.pojo;

import java.io.Serializable;
import java.util.Date;

public class Pinglun implements Serializable {
    private Integer plId;

    private Integer uId;

    private Integer dtId;

    private Integer plUpid;

    private String plText;

    private Date plTime;

    private static final long serialVersionUID = 1L;

    public Integer getPlId() {
        return plId;
    }

    public void setPlId(Integer plId) {
        this.plId = plId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getDtId() {
        return dtId;
    }

    public void setDtId(Integer dtId) {
        this.dtId = dtId;
    }

    public Integer getPlUpid() {
        return plUpid;
    }

    public void setPlUpid(Integer plUpid) {
        this.plUpid = plUpid;
    }

    public String getPlText() {
        return plText;
    }

    public void setPlText(String plText) {
        this.plText = plText;
    }

    public Date getPlTime() {
        return plTime;
    }

    public void setPlTime(Date plTime) {
        this.plTime = plTime;
    }
}