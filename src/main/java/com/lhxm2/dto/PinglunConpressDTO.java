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
 * Created by 12902 on 2019/1/17/16:28.
 */
public class PinglunConpressDTO {
    private Integer uId;
    private String plText;
    private Date plTime;
    private String uNickname;

    public PinglunConpressDTO() {
    }

    public PinglunConpressDTO(Integer uId, String plText, Date plTime, String uNickname) {
        this.uId = uId;
        this.plText = plText;
        this.plTime = plTime;
        this.uNickname = uNickname;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getPlText() {
        return plText;
    }

    public void setPlText(String plText) {
        this.plText = plText;
    }

    public Date getPlTime() {
        return plTime;
    }

    public void setPlTime(Date plTime) {
        this.plTime = plTime;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    @Override
    public String toString() {
        return "PinglunConpressDTO{" +
                "uId=" + uId +
                ", plText='" + plText + '\'' +
                ", plTime=" + plTime +
                ", uNickname='" + uNickname + '\'' +
                '}';
    }
}
