package com.lhxm2.pojo;

import java.io.Serializable;

public class Pen implements Serializable {
    private Integer pId;

    private String pStyle;

    private static final long serialVersionUID = 1L;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpStyle() {
        return pStyle;
    }

    public void setpStyle(String pStyle) {
        this.pStyle = pStyle;
    }
}