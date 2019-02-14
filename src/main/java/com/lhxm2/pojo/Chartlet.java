package com.lhxm2.pojo;

import java.io.Serializable;

public class Chartlet implements Serializable {
    private Integer cId;

    private String cUrl;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcUrl() {
        return cUrl;
    }

    public void setcUrl(String cUrl) {
        this.cUrl = cUrl;
    }
}