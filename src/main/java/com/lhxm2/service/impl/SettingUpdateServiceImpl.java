package com.lhxm2.service.impl;

import com.lhxm2.dao.UserMapper;
import com.lhxm2.pojo.User;
import com.lhxm2.service.SettingUpdateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author:Dustyhandhe Date: 2019-02-16
 * Time: 14:50
 */
@Service
public class SettingUpdateServiceImpl implements SettingUpdateService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User findById(int uId) {
        User user = userMapper.selectByPrimaryKey(uId);
//        System.out.println(user.toString());
        return user;
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);

    }
}
