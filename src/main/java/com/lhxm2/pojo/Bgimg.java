package com.lhxm2.pojo;

import java.io.Serializable;

public class Bgimg implements Serializable {
    private Integer bgId;

    private String bgUrl;

    private static final long serialVersionUID = 1L;

    public Integer getBgId() {
        return bgId;
    }

    public void setBgId(Integer bgId) {
        this.bgId = bgId;
    }

    public String getbgUrl() {
        return bgUrl;
    }

    public void setbgUrl(String bgUrl) {
        this.bgUrl = bgUrl;
    }
}