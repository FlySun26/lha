package com.lhxm2.pojo;

import java.io.Serializable;

public class HaMubanChartlet implements Serializable {
    private Integer hmcId;

    private Integer haId;

    private Integer muId;

    private Integer cId;

    private Integer hmcX;

    private Integer hmcY;

    private Integer hmcWidth;

    private Integer hmcHeight;

    private static final long serialVersionUID = 1L;

    public Integer getHmcId() {
        return hmcId;
    }

    public void setHmcId(Integer hmcId) {
        this.hmcId = hmcId;
    }

    public Integer getHaId() {
        return haId;
    }

    public void setHaId(Integer haId) {
        this.haId = haId;
    }

    public Integer getMuId() {
        return muId;
    }

    public void setMuId(Integer muId) {
        this.muId = muId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getHmcX() {
        return hmcX;
    }

    public void setHmcX(Integer hmcX) {
        this.hmcX = hmcX;
    }

    public Integer getHmcY() {
        return hmcY;
    }

    public void setHmcY(Integer hmcY) {
        this.hmcY = hmcY;
    }

    public Integer gethmcWidth() {
        return hmcWidth;
    }

    public void sethmcWidth(Integer hmcWidth) {
        this.hmcWidth = hmcWidth;
    }

    public Integer getHmcHeight() {
        return hmcHeight;
    }

    public void setHmcHeight(Integer hmcHeight) {
        this.hmcHeight = hmcHeight;
    }
}