package com.lhxm2.action;

import com.lhxm2.pojo.User;
import com.lhxm2.service.SettingUpdateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author:Dustyhandhe Date: 2019-02-16
 * Time: 14:58
 */

/**
 * 修改个人信息
 */
@Controller
public class UpdateController {
    @Resource
    private SettingUpdateService settingUpdateService;

    @RequestMapping("/toUpdate/{uId}")
    @ResponseBody
    public User toUpdate(@PathVariable int uId, Model model) {
        User user = settingUpdateService.findById(uId);
        model.addAttribute("user", user);
        return user;
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(User user, HttpSession httpSession) {
        int i = settingUpdateService.update(user);
        return i;
    }
}
