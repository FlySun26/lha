package com.lhxm2.action;

import com.lhxm2.dto.BgimgDTO;
import com.lhxm2.dto.MubanDTO;
import com.lhxm2.dto.UserMubanDTO;
import com.lhxm2.pojo.User;
import com.lhxm2.service.MubanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 杨河宽创建
 */
@Controller
public class MunbanAction {
    @Autowired
    private MubanService mubanService;

    /**
     * 查询全部模板
     * @return
     */
    @RequestMapping("/getmubans")
    @ResponseBody
    public List<MubanDTO> getmubans(){
        List<MubanDTO> mubanDTOS = mubanService.findAllMuban();
        return mubanDTOS;
    }

    /**
     * 根据id查询模板
     * @param muId
     * @return
     */
    @RequestMapping("/getmubanbyid")
    @ResponseBody
    public MubanDTO getmubanbyid(int muId){
        MubanDTO mubanDTO = mubanService.findMubanById(muId);
        return mubanDTO;
    }

    /**
     * 根据用户id保存模板
     * @param userMubanDTO
     * @param session
     * @return
     */
    @RequestMapping("/savemuban")
    @ResponseBody
    public Map<String,Object> savemuban(UserMubanDTO userMubanDTO, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        //User user = (User)session.getAttribute("user");
        //userMubanDTO.setuId(user.getuId());
        int i = mubanService.savemuban(userMubanDTO);
        map.put("status",i);
        return map;
    }
    @RequestMapping("/usemuban")
    @ResponseBody
    public Map<String,Object> usemuban(int muId){
        Map<String,Object> map = new HashMap<>();
        //根据模板id查询壁纸
        BgimgDTO bgimgDTO=mubanService.findBgimgById(muId);

        return map;
    }
}
