package com.lhxm2.pojo;

import java.io.Serializable;

public class Focus implements Serializable {
    private Integer fId;

    private Integer fBefocus;

    private Integer fFocus;

    private static final long serialVersionUID = 1L;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getfBefocus() {
        return fBefocus;
    }

    public void setfBefocus(Integer fBefocus) {
        this.fBefocus = fBefocus;
    }

    public Integer getfFocus() {
        return fFocus;
    }

    public void setfFocus(Integer fFocus) {
        this.fFocus = fFocus;
    }
}