package com.lhxm2.pojo;

import java.io.Serializable;

public class ZbLike implements Serializable {
    private Integer zlId;

    private Integer uId;

    private Integer zbId;

    private static final long serialVersionUID = 1L;

    public Integer getZlId() {
        return zlId;
    }

    public void setZlId(Integer zlId) {
        this.zlId = zlId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getZbId() {
        return zbId;
    }

    public void setZbId(Integer zbId) {
        this.zbId = zbId;
    }
}