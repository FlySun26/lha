package com.lhxm2.pojo;

import java.io.Serializable;

public class Tongzhi implements Serializable {
    private Integer tzId;

    private Integer uId;

    private Integer dtId;

    private static final long serialVersionUID = 1L;

    public Integer getTzId() {
        return tzId;
    }

    public void setTzId(Integer tzId) {
        this.tzId = tzId;
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
}