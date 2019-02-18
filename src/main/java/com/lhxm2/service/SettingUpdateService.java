package com.lhxm2.service;

import com.lhxm2.pojo.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author:Dustyhandhe Date: 2019-02-16
 * Time: 14:45
 */
public interface SettingUpdateService {
    public User findById(int uId);

    public int update(User user);
}
