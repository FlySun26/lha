package com.lhxm2.dto;

public class MubanDTO {
    private Integer muId;

    private String muName;

    private String muUrl;

    public Integer getMuId() {
        return muId;
    }

    public void setMuId(Integer muId) {
        this.muId = muId;
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

    public MubanDTO(Integer muId, String muName, String muUrl) {
        this.muId = muId;
        this.muName = muName;
        this.muUrl = muUrl;
    }

    public MubanDTO() {
    }
}
