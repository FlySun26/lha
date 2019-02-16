package com.lhxm2.action;//
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

import com.alibaba.fastjson.JSON;
import com.lhxm2.pojo.Pinglun;
import com.lhxm2.service.PinglunService;
import com.lhxm2.util.R;
import org.apache.http.HttpResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by 12902 on 2019/1/15/21:27.
 */

@RestController
public class DtPinglunController {
    @Resource
    private PinglunService pinglunService;
    @RequestMapping("/dongtai/pinglunsave")
    public R pinglun(@RequestBody Pinglun pinglun) {
        return pinglunService.savePingLun(pinglun);
    }

    @RequestMapping("/dongtai/findpinglun")
    public void findpinglun(Integer dongtaiId, HttpServletResponse response) {
        //设置响应头
        response.setContentType("application/json;charset=UTF-8");
        //h5跨域
        response.setHeader("Access-Control-Allow-Origin","*");
        R r = pinglunService.fingPingLun(dongtaiId);
        List list = (List) r.get("list");
        String json  = JSON.toJSONString(list);
        PrintWriter pw = null;
        try {
            pw = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.print(json);
        pw.flush();
        pw.close();
    }

}
