package com.lhxm2.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer uId;

    private String uPassword;

    private String uNickname;

    private String uHeadimg;

    private String uSign;

    private String uTel;

    private String uSex;

    private Integer uState;

    private Integer rId;

    private Integer uLikenum;

    private static final long serialVersionUID = 1L;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
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

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public Integer getuState() {
        return uState;
    }

    public void setuState(Integer uState) {
        this.uState = uState;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getuLikenum() {
        return uLikenum;
    }

    public void setuLikenum(Integer uLikenum) {
        this.uLikenum = uLikenum;
    }
}