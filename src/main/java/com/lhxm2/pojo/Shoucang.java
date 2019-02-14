package com.lhxm2.pojo;

import java.io.Serializable;

public class Shoucang implements Serializable {
    private Integer scId;

    private Integer uId;

    private Integer haId;

    private static final long serialVersionUID = 1L;

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getHaId() {
        return haId;
    }

    public void setHaId(Integer haId) {
        this.haId = haId;
    }
}