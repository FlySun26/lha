package com.lhxm2.pojo;

import java.io.Serializable;

public class Zhangben implements Serializable {
    private Integer zbId;

    private Integer uId;

    private Integer zbRole;

    private String zbName;

    private String zbFm;

    private static final long serialVersionUID = 1L;

    public Integer getZbId() {
        return zbId;
    }

    public void setZbId(Integer zbId) {
        this.zbId = zbId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getZbRole() {
        return zbRole;
    }

    public void setZbRole(Integer zbRole) {
        this.zbRole = zbRole;
    }

    public String getZbName() {
        return zbName;
    }

    public void setZbName(String zbName) {
        this.zbName = zbName;
    }

    public String getZbFm() {
        return zbFm;
    }

    public void setZbFm(String zbFm) {
        this.zbFm = zbFm;
    }
}