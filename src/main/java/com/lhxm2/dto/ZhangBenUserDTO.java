package com.lhxm2.dto;

import java.util.List;

public class ZhangBenUserDTO {
    private String uId;

    private String uNickname;

    private String uHeadimg;

    private String uSign;

    private String uLikenum;

    private String funsnum;

    private String focusnum;

    private String isFocus;

    public String getIsFocus() {
        return isFocus;
    }

    public void setIsFocus(String isFocus) {
        this.isFocus = isFocus;
    }

    private List<ZhangBenListDTO> zblist;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public String getuHeadimg() {
        return uHeadimg;
    }

    public void setuHeadimg(String uHeadimg) {
        this.uHeadimg = uHeadimg;
    }

    public String getuSign() {
        return uSign;
    }

    public void setuSign(String uSign) {
        this.uSign = uSign;
    }

    public String getuLikenum() {
        return uLikenum;
    }

    public void setuLikenum(String uLikenum) {
        this.uLikenum = uLikenum;
    }

    public String getFunsnum() {
        return funsnum;
    }

    public void setFunsnum(String funsnum) {
        this.funsnum = funsnum;
    }

    public String getFocusnum() {
        return focusnum;
    }

    public void setFocusnum(String focusnum) {
        this.focusnum = focusnum;
    }

    public List<ZhangBenListDTO> getZblist() {
        return zblist;
    }

    public void setZblist(List<ZhangBenListDTO> zblist) {
        this.zblist = zblist;
    }
}
