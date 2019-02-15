package com.lhxm2.action;

import com.lhxm2.dto.UserFunsDTO;
import com.lhxm2.service.MyselfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class MyselfController {
    @Autowired
    private MyselfService myselfService;

    /**
     * 查询粉丝列表
     * @param userid
     * @return
     */
    @RequestMapping("/myself/findfuns")
    @ResponseBody
    public Map<String,Object> findfuns(@RequestParam(value = "userid",defaultValue = "-1")int userid){
        Map<String,Object> map = new HashMap<>();
        if (userid==-1){
            map.put("code",1);
            map.put("msg","noUserId");
        }else {
            List<UserFunsDTO> list = myselfService.findfuns(userid);
            if (list!=null){
                map.put("code",0);
                map.put("msg","success");
                map.put("users",list);
            }else {
                map.put("code",1);
                map.put("msg","default");
            }
        }
        return map;
    }

    /**
     * 查询关注列表
     * @param userid
     * @return
     */
    @RequestMapping("/myself/findfocus")
    @ResponseBody
    public Map<String,Object> findfocus(@RequestParam(value = "userid",defaultValue = "-1")int userid){
        Map<String,Object> map = new HashMap<>();
        if (userid==-1){
            map.put("code",1);
            map.put("msg","noUserId");
        }else {
            List<UserFunsDTO> list = myselfService.findfocus(userid);
            if (list!=null){
                map.put("code",0);
                map.put("msg","success");
                map.put("users",list);
            }else {
                map.put("code",1);
                map.put("msg","default");
            }
        }
        return map;
    }

    /**
     * 搜索用户
     * @param request
     * @return
     */
    @RequestMapping("/findUser")
    @ResponseBody
    public Map<String,Object> findUser(HttpServletRequest request){
        Map map = new HashMap();
        String uNickname = request.getParameter("uNickname");
        String s = request.getParameter("userid");
        System.out.println("用户id:"+s+" 正在搜索用户:"+uNickname);
        if (s==null){
            map.put("code",1);
            map.put("msg","请先登录");
            return map;
        }
        int userid = Integer.parseInt(s);
        List<UserFunsDTO> list = myselfService.findUser(uNickname,userid);
        if (list!=null){
            map.put("code",0);
            map.put("msg","success");
            map.put("users",list);
        }else {
            map.put("code",1);
            map.put("msg","default");
        }
        return map;
    }

}
