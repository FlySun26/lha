package com.lhxm2.dto;//
//                       _oo0oo_
//                      o8888888o
//                      88" . "88
//                      (| -_- |)
//                      0\  =  /0
//                    ___/`---'\___
//                  .' \\|     |// '.
//                 / \\|||  :  |||// \
//                / _||||| -:- |||||- \
//               |   | \\\  -  /// |   |
//               | \_|  ''\---/''  |_/ |
//               \  .-\__  '-'  ___/-. /
//             ___'. .'  /--.--\  `. .'___
//          ."" '<  `.___\_<|>_/___.' >' "".
//         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
//         \  \ `_.   \_ __\ /__ _/   .-` /  /
//     =====`-.____`.___ \_____/___.-`___.-'=====
//                       `=---='
//
//
//     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//
//                佛祖保佑       永无BUG
//      佛曰:
//             写字楼里写字间，写字间里程序员；
//             程序人员写程序，又拿程序换酒钱。
//             酒醒只在网上坐，酒醉还来网下眠；
//             酒醉酒醒日复日，网上网下年复年。
//             但愿老死电脑间，不愿鞠躬老板前；
//             奔驰宝马贵者趣，公交自行程序员。
//             别人笑我忒疯癫，我笑自己命太贱；
//             不见满街漂亮妹，哪个归得程序员？

import java.util.Date;

/**
 * Created by 12902 on 2019/1/17/15:33.
 */
public class PinglunDTO {
    private Integer plId;//父评论ID
    private Integer uId;//父评论用户ID
    private String fNickname;//父评论昵称
    private String plText;//父评论内容
    private Integer plIdCh;//子评论ID
    private Integer uIdCh;//子评论用户ID
    private String NicknameCh;//子评论用户昵称
    private String plTextCh;//子评论内容
    private Date pldate;//评论时间

    public PinglunDTO() {
    }


    public PinglunDTO(Integer plId, Integer uId, String fNickname, String plText, Integer plIdCh, Integer uIdCh, String nicknameCh, String plTextCh, Date pldate) {
        this.plId = plId;
        this.uId = uId;
        this.fNickname = fNickname;
        this.plText = plText;
        this.plIdCh = plIdCh;
        this.uIdCh = uIdCh;
        NicknameCh = nicknameCh;
        this.plTextCh = plTextCh;
        this.pldate = pldate;
    }

    public Integer getPlId() {
        return plId;
    }

    public void setPlId(Integer plId) {
        this.plId = plId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getfNickname() {
        return fNickname;
    }

    public void setfNickname(String fNickname) {
        this.fNickname = fNickname;
    }

    public String getPlText() {
        return plText;
    }

    public void setPlText(String plText) {
        this.plText = plText;
    }

    public Integer getPlIdCh() {
        return plIdCh;
    }

    public void setPlIdCh(Integer plIdCh) {
        this.plIdCh = plIdCh;
    }

    public Integer getuIdCh() {
        return uIdCh;
    }

    public void setuIdCh(Integer uIdCh) {
        this.uIdCh = uIdCh;
    }

    public String getNicknameCh() {
        return NicknameCh;
    }

    public void setNicknameCh(String nicknameCh) {
        NicknameCh = nicknameCh;
    }

    public String getPlTextCh() {
        return plTextCh;
    }

    public void setPlTextCh(String plTextCh) {
        this.plTextCh = plTextCh;
    }

    public Date getPldate() {
        return pldate;
    }

    public void setPldate(Date pldate) {
        this.pldate = pldate;
    }

    @Override
    public String toString() {
        return "PinglunDTO{" +
                "plId=" + plId +
                ", uId=" + uId +
                ", fNickname='" + fNickname + '\'' +
                ", plText='" + plText + '\'' +
                ", plIdCh=" + plIdCh +
                ", uIdCh=" + uIdCh +
                ", NicknameCh='" + NicknameCh + '\'' +
                ", plTextCh='" + plTextCh + '\'' +
                ", pldate=" + pldate +
                '}';
    }
}


