package com.lhxm2.pojo;

import java.io.Serializable;

public class Muban implements Serializable {
    private Integer muId;

    private Integer bgId;

    private String muName;

    private String muUrl;

    private static final long serialVersionUID = 1L;

    public Integer getMuId() {
        return muId;
    }

    public void setMuId(Integer muId) {
        this.muId = muId;
    }

    public Integer getBgId() {
        return bgId;
    }

    public void setBgId(Integer bgId) {
        this.bgId = bgId;
    }

    public String getMuName() {
        return muName;
    }

    public void setMuName(String muName) {
        this.muName = muName;
    }

    public String getMuUrl() {
        return muUrl;
    }

    public void setMuUrl(String muUrl) {
        this.muUrl = muUrl;
    }
}