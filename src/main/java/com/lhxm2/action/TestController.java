package com.lhxm2.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {


    @ResponseBody
    @RequestMapping("/test")
    public Map<String,Object> test(){
        Map map = new HashMap();
        System.out.println("asdasd");
        System.out.println("222");
        System.out.println("1213");
        System.out.println("aaaaaa");
        map.put("test","test");
        return map;
    }
}
