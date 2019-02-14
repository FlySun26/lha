package com.lhxm2.pojo;

import java.io.Serializable;

public class UserMuban implements Serializable {
    private Integer umId;

    private Integer muId;

    private Integer uId;

    private static final long serialVersionUID = 1L;

    public Integer getUmId() {
        return umId;
    }

    public void setUmId(Integer umId) {
        this.umId = umId;
    }

    public Integer getMuId() {
        return muId;
    }

    public void setMuId(Integer muId) {
        this.muId = muId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}