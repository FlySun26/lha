package com.lhxm2.pojo;

import java.io.Serializable;

public class UserBgimg implements Serializable {
    private Integer ubgId;

    private Integer bgId;

    private Integer uId;

    private static final long serialVersionUID = 1L;

    public Integer getUbgId() {
        return ubgId;
    }

    public void setUbgId(Integer ubgId) {
        this.ubgId = ubgId;
    }

    public Integer getBgId() {
        return bgId;
    }

    public void setBgId(Integer bgId) {
        this.bgId = bgId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}