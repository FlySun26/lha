package com.lhxm2.pojo;

import java.io.Serializable;

public class HaMubanText implements Serializable {
    private Integer hmtId;

    private Integer haId;

    private Integer muId;

    private String hmtText;

    private Integer fsId;

    private Integer hmtSize;

    private String hmtColor;

    private Integer hmtColorlv;

    private static final long serialVersionUID = 1L;

    public Integer getHmtId() {
        return hmtId;
    }

    public void setHmtId(Integer hmtId) {
        this.hmtId = hmtId;
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

    public String getHmtText() {
        return hmtText;
    }

    public void setHmtText(String hmtText) {
        this.hmtText = hmtText;
    }

    public Integer getFsId() {
        return fsId;
    }

    public void setFsId(Integer fsId) {
        this.fsId = fsId;
    }

    public Integer getHmtSize() {
        return hmtSize;
    }

    public void setHmtSize(Integer hmtSize) {
        this.hmtSize = hmtSize;
    }

    public String getHmtColor() {
        return hmtColor;
    }

    public void setHmtColor(String hmtColor) {
        this.hmtColor = hmtColor;
    }

    public Integer getHmtColorlv() {
        return hmtColorlv;
    }

    public void setHmtColorlv(Integer hmtColorlv) {
        this.hmtColorlv = hmtColorlv;
    }
}