package com.lhxm2.action;

import com.lhxm2.dto.TokenDTO;
import com.lhxm2.dto.UserDTO;
import com.lhxm2.pojo.User;
import com.lhxm2.service.TokenService;
import com.lhxm2.service.UserService;
import com.lhxm2.util.GetMessageCode;
import com.lhxm2.util.MD5Utils;
import com.lhxm2.util.R;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;

/**
 * //                            _ooOoo_
 * //                           o8888888o
 * //                           88" . "88
 * //                           (| -_- |)
 * //                            O\ = /O
 * //                        ____/`---'\____
 * //                      .   ' \\| |// `.
 * //                       / \\||| : |||// \
 * //                     / _||||| -:- |||||- \
 * //                       | | \\\ - /// | |
 * //                     | \_| ''\---/'' | |
 * //                      \ .-\__ `-` ___/-. /
 * //                   ___`. .' /--.--\ `. . __
 * //                ."" '< `.___\_<|>_/___.' >'"".
 * //               | | : `- \`.;`\ _ /`;.`/ - ` : | |
 * //                 \ \ `-. \_ __\ /__ _/ .-` / /
 * //         ======`-.____`-.___\_____/___.-`____.-'======
 * //                            `=---='
 * //
 * //         .............................................
 * //                  佛祖镇楼                  BUG辟易
 * //          佛曰:
 * //                  写字楼里写字间，写字间里程序员；
 * //                  程序人员写程序，又拿程序换酒钱。
 * //                  酒醒只在网上坐，酒醉还来网下眠；
 * //                  酒醉酒醒日复日，网上网下年复年。
 * //                  但愿老死电脑间，不愿鞠躬老板前；
 * //                  奔驰宝马贵者趣，公交自行程序员。
 * //                  别人笑我忒疯癫，我笑自己命太贱；
 * //                  不见满街漂亮妹，哪个归得程序员？
 *
 * @Author: 蔡伟强
 * @Date: 2019/2/12
 * @Time: 14:58
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //依赖token服务层
    @Autowired
    private TokenService tokenService;

    /*
     *  用户密码登录
     * */
    @RequestMapping("/pwdLogin")
    @ResponseBody
    public R pwdLogin(HttpServletRequest request) throws JSONException {
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        User user = userService.findByPhone(phone);
        if (user != null) {
            String pwd = user.getuPassword();//查询用户密码
            String md5pwd = MD5Utils.md5(phone, password, 1024);//输入密码加密
            if (md5pwd.equals(pwd)) {
                String token = UUID.randomUUID().toString();//生成token
                Integer uId = user.getuId(); //用户id
                long time = System.currentTimeMillis();
                //封装token对象
                TokenDTO tokenDTO = new TokenDTO();
                tokenDTO.setExpTime(new Date(time + 60 * 1000 * 60 * 24 * 7));//7天
                tokenDTO.setUpTime(new Date());
                tokenDTO.setToken(token);
                tokenDTO.setuId(uId);
                int i = tokenService.addToken(tokenDTO);
                if (i > 0) {
                    String headImg = user.getuHeadimg();//头像存储路径
                    return R.ok(0, "登录成功").put("token",token).put("headimg",headImg).put("uid",uId);
                } else {
                    return R.error(-1, "登录失败");
                }
            } else {
                return R.error(-2, "密码错误");
            }
        } else {
            return R.error(-3, "账号不存在");
        }
    }

    /*
     *  短信验证码登录
     * */
    @RequestMapping("/vcodeLogin")
    @ResponseBody
    public R vcodeLogin(HttpServletRequest request) throws JSONException {
        String phone = request.getParameter("phone");
        String code1 = request.getParameter("code");
        String code2 = (String) request.getSession().getAttribute("code");
        if (code1.equalsIgnoreCase(code2)) { //比较验证码是否相等
            User user = userService.findByPhone(phone);
            if (user != null) { //登录成功
                String token = UUID.randomUUID().toString();//生成token
                long time = System.currentTimeMillis(); //获取当前时间的毫秒值
                Integer uId = user.getuId(); //用户id
                //封装token对象
                TokenDTO tokenDTO = new TokenDTO();
                tokenDTO.setExpTime(new Date(time + 60 * 1000 * 60 * 24 * 7));//7天
                tokenDTO.setUpTime(new Date());
                tokenDTO.setToken(token);
                tokenDTO.setuId(uId);
                int i = tokenService.addToken(tokenDTO);//保存token
                if (i > 0) {
                    String headImg = user.getuHeadimg();//获得头像存储路径
                    return R.ok(0, "登录成功").put("token", token).put("headimg", headImg).put("uid",uId);
                } else {
                    return R.error(-1, "登录失败");
                }
            } else {
                return R.error(-2, "账号不存在");
            }
        } else {
            return R.error(-3, "验证码错误");
        }
    }

    /*
    *  重置密码
    * */
    @RequestMapping("/pwdReset")
    @ResponseBody
    public R pwdReset(HttpServletRequest request) {
        String phone = request.getParameter("phone");
        String code1  = request.getParameter("code");//输入验证码
        String password = request.getParameter("password");
        //System.out.println("phone="+phone+" password="+password);
        String code2 = (String) request.getSession().getAttribute("code");//短信生产验证码
        if (code1.equalsIgnoreCase(code2)) {
            User user = userService.findByPhone(phone);
            if (user != null) {
                user.setuPassword(MD5Utils.md5(phone, password, 1024));//修改密码
                System.out.println("修改："+user.getuPassword());
                int i = userService.pwdRest(user);
                if (i > 0) {
                    return R.ok(0, "修改成功");
                } else {
                    return R.error(-1, "修改失败");
                }
            } else {
                return R.error(-2, "账号不存在");
            }
        }
        return R.error(-3,"验证码不正确");
    }

    /*
     *  用户注册
    * */
    @RequestMapping("/Register")
    @ResponseBody
    public R register(HttpServletRequest request) throws JSONException {
        String phone = request.getParameter("phone");
        String code1  = request.getParameter("code");//输入验证码
        String password = request.getParameter("password");
        String code2 = (String) request.getSession().getAttribute("code");//短信生产验证码
        if (code1.equalsIgnoreCase(code2)) {
            User user = userService.findByPhone(phone);
            if (user==null) { //账号未注册
                //封装对象
                UserDTO userDTO = new UserDTO();
                userDTO.setuLoginName(phone);
                String md5pwd = MD5Utils.md5(phone, password, 1024);//密码加密
                userDTO.setuPassword(md5pwd);
                int i = userService.register(userDTO);
                if (i > 0) {
                    return R.ok(0, "注册成功");
                } else {
                    return R.error(-1, "注册失败");
                }
            } else {
                return R.error(-2, "账号已注册");
            }
        }
        return R.error(-3,"验证码不正确");
    }


    /*
     *  发送验证码
     * */
    @RequestMapping("/GetCode")
    @ResponseBody
    public R getCode(HttpServletRequest request) throws JSONException {
        String phone = request.getParameter("phone");
        String code = GetMessageCode.getCode(phone);
        //模拟
        //String code = "123456";
        System.out.println("code:"+code);
        if (code != null) {
            request.getSession().setAttribute("code",code);//短信验证码
            return R.ok(0,"发送成功");
        }
        return R.error(-1,"发送失败");
    }

}
