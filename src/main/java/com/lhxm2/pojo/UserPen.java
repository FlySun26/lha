package com.lhxm2.pojo;

import java.io.Serializable;

public class UserPen implements Serializable {
    private Integer upenId;

    private Integer pId;

    private Integer uId;

    private static final long serialVersionUID = 1L;

    public Integer getUpenId() {
        return upenId;
    }

    public void setUpenId(Integer upenId) {
        this.upenId = upenId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}