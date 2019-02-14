package com.lhxm2.service;

import com.lhxm2.dto.UserFunsDTO;

import java.util.List;

public interface MyselfService {

    /**
     * 淳于永晨创建
     * 用于查询当前用户的粉丝列表
     * @param userid
     * @return
     */
    List<UserFunsDTO> findfuns(int userid);
    /**
     * 淳于永晨创建
     * 用于查询当前用户的关注列表
     * @param userid
     * @return
     */
    List<UserFunsDTO> findfocus(int userid);

    /**
     * 淳于永晨创建
     * 用于搜索
     * @param uNickname
     * @param userid
     * @return
     */
    List<UserFunsDTO> findUser(String uNickname,Integer userid);

}
