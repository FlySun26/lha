package com.lhxm2.service.impl;//
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

import com.lhxm2.dao.PinglunMapper;
import com.lhxm2.dto.PinglunConpressDTO;
import com.lhxm2.dto.PinglunDTO;
import com.lhxm2.pojo.Pinglun;
import com.lhxm2.service.PinglunService;
import com.lhxm2.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 12902 on 2019/1/15/21:24.
 */
@Service
public class PingLunServiceImpl implements PinglunService {
    @Resource
    PinglunMapper pinglunMapper;
    @Override
    public R savePingLun(Pinglun pinglun) {
        int i = pinglunMapper.insertSelective(pinglun);
        return i>0? R.ok(): R.error("评论失败");
    }

    @Override
    public R fingPingLun(Integer DongtaiId) {
        List<PinglunDTO> pinglunDTOList = pinglunMapper.findPingLunDTO(DongtaiId);

        return R.ok().put("list", pinglunDTOList);
    }

    @Override
    public R findPlCompress(Integer DongtaiId) {
        List<PinglunConpressDTO> conpressDTOList = pinglunMapper.findCompressPl(DongtaiId);
        System.out.println(conpressDTOList.size());
        return R.ok().put("compresspl", conpressDTOList);
    }
}
