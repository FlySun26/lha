package com.lhxm2.pojo;

import java.io.Serializable;

public class UserChartlet implements Serializable {
    private Integer uclId;

    private Integer cId;

    private Integer uId;

    private static final long serialVersionUID = 1L;

    public Integer getUclId() {
        return uclId;
    }

    public void setUclId(Integer uclId) {
        this.uclId = uclId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}