package com.lhxm2.action;

import com.lhxm2.dto.ZhangBenUserDTO;
import com.lhxm2.service.ZhangBenCYYCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ZhangBenCYYCController {

    @Autowired
    private ZhangBenCYYCService zhangBenCYYCService;

    @RequestMapping("/getzhangbenlist")
    @ResponseBody
    public Map<String,Object> getzhangbenlist(@RequestParam(value = "userid",defaultValue = "-1")int userid,
                                              @RequestParam(value = "loginuserid",defaultValue = "-1")int loginuserid){
        Map map = new HashMap();
        if (userid==-1||loginuserid==-1){
            map.put("code",1);
            map.put("msg","noUserId");
        }else{
            ZhangBenUserDTO zhangBenUserDTO = zhangBenCYYCService.getzhangbenlist(userid,loginuserid);
            map.put("code",0);
            map.put("msg","success");
            map.put("zhangBenUser",zhangBenUserDTO);
        }
        return map;
    }
}
