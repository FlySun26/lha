package com.lhxm2.dto;

public class UserMubanDTO {
    private Integer umId;

    private Integer muId;

    private Integer uId;

    public UserMubanDTO(Integer umId, Integer muId, Integer uId) {
        this.umId = umId;
        this.muId = muId;
        this.uId = uId;
    }

    public UserMubanDTO() {
    }

    public Integer getUmId() {
        return umId;
    }

    public void setUmId(Integer umId) {
        this.umId = umId;
    }

    public Integer getMuId() {
        return muId;
    }

    public void setMuId(Integer muId) {
        this.muId = muId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}
