package com.lhxm2.pojo;

import java.io.Serializable;

public class HandAccount implements Serializable {
    private Integer haId;

    private Integer uId;

    private Integer bgId;

    private Integer haState;

    private String haName;

    private Integer zbId;

    private Integer haTime;

    private static final long serialVersionUID = 1L;

    public Integer getHaId() {
        return haId;
    }

    public void setHaId(Integer haId) {
        this.haId = haId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getBgId() {
        return bgId;
    }

    public void setBgId(Integer bgId) {
        this.bgId = bgId;
    }

    public Integer getHaState() {
        return haState;
    }

    public void setHaState(Integer haState) {
        this.haState = haState;
    }

    public String getHaName() {
        return haName;
    }

    public void setHaName(String haName) {
        this.haName = haName;
    }

    public Integer getZbId() {
        return zbId;
    }

    public void setZbId(Integer zbId) {
        this.zbId = zbId;
    }

    public Integer getHaTime() {
        return haTime;
    }

    public void setHaTime(Integer haTime) {
        this.haTime = haTime;
    }
}