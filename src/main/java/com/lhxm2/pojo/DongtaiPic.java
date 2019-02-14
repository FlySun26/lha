package com.lhxm2.pojo;

import java.io.Serializable;

public class DongtaiPic implements Serializable {
    private Integer dpicId;

    private Integer dtId;

    private String dpicUrl;

    private static final long serialVersionUID = 1L;

    public Integer getDpicId() {
        return dpicId;
    }

    public void setDpicId(Integer dpicId) {
        this.dpicId = dpicId;
    }

    public Integer getDtId() {
        return dtId;
    }

    public void setDtId(Integer dtId) {
        this.dtId = dtId;
    }

    public String getDpicUrl() {
        return dpicUrl;
    }

    public void setDpicUrl(String dpicUrl) {
        this.dpicUrl = dpicUrl;
    }
}