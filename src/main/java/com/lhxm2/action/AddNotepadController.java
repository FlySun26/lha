package com.lhxm2.action;

import com.lhxm2.pojo.Chartlet;
import com.lhxm2.pojo.User;
import com.lhxm2.pojo.UserChartlet;
import com.lhxm2.service.AddNotePadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
public class AddNotepadController {

    @Autowired
    private AddNotePadService addNotePadService;

    /**
     * @function 点击贴纸获取自带贴纸
     * @author 琚高举
     */
    @RequestMapping("/getSysChartlet")
    public Map<String,Object> getChartlet(){
        List<Chartlet> chartlets = addNotePadService.findAll();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","success");
        map.put("chartlets", chartlets);
        return map;
    }

    /**
     * @function 选中贴纸后关联用户
     * @author 琚高举
     */
    @RequestMapping("/selectmine/{state}/{chartletid}")
    public Map<String,Object> selectMine(@PathVariable Integer chartletid,@PathVariable Integer state, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        User user = (User) session.getAttribute("user");
        UserChartlet userChartlet = new UserChartlet();
        Integer uid = user.getuId();
        userChartlet.setuId(uid);
        userChartlet.setcId(chartletid);
        if (state==0){
            //如果状态为0则为选中贴纸,则关联用户
            int res = addNotePadService.tagBindUser(userChartlet);
            map.put("code", 0);
            map.put("msg", "success");
            return map;
        }else {
            //否则为取消贴纸,删除关联用户
            int res = addNotePadService.tagSplitUser(userChartlet);
            map.put("code", 1);
            map.put("msg", "failed");
            return map;
        }
    }


    /**
     * @function 删除贴纸(如果有关联用户,删除关联表数据)
     * @author 琚高举
     */
    @RequestMapping("/delChartlet/{chartletid}")
    public Map<String,Object> delChartlet(@PathVariable Integer chartletid,HttpSession session){
        Map<String,Object> map = new HashMap<>();
        User user = (User) session.getAttribute("user");
        Integer uid = user.getuId();
        int res = addNotePadService.delChartletByCid(chartletid,uid);
        if (res==2){
            map.put("code", 0);
            map.put("msg", "success");
            return map;
        }else {
            map.put("code", 1);
            map.put("msg", "failed");
            return map;
        }
    }







}
