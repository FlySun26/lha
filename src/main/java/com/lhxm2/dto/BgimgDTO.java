package com.lhxm2.dto;

public class BgimgDTO {
    private Integer bgId;

    private String bgUrl;

    public BgimgDTO() {
    }

    public Integer getBgId() {
        return bgId;
    }

    public void setBgId(Integer bgId) {
        this.bgId = bgId;
    }

    public String getBgUrl() {
        return bgUrl;
    }

    public void setBgUrl(String bgUrl) {
        this.bgUrl = bgUrl;
    }

    public BgimgDTO(Integer bgId, String bgUrl) {
        this.bgId = bgId;
        this.bgUrl = bgUrl;
    }
}
