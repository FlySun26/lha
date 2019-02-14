package com.lhxm2.pojo;

import java.io.Serializable;

public class Liked implements Serializable {
    private Integer likeId;

    private Integer uId;

    private Integer dtId;

    private static final long serialVersionUID = 1L;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
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