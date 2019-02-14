package com.lhxm2.service.impl;

import com.lhxm2.dao.FocusMapper;
import com.lhxm2.dao.UserMapper;
import com.lhxm2.dto.UserFunsDTO;
import com.lhxm2.pojo.Focus;
import com.lhxm2.pojo.User;
import com.lhxm2.pojo.UserExample;
import com.lhxm2.service.MyselfService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MyselfServiceImpl implements MyselfService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private FocusMapper focusMapper;


    /**
     * 淳于永晨创建
     * 用于查询当前用户的关注列表
     * @param userid
     * @return
     */
    @Override
    public List<UserFunsDTO> findfocus(int userid) {
        Map map = new HashMap();
        map.put("uid",userid);
        List<User> userList = userMapper.findfocus(map);
        List<UserFunsDTO> userFunsDTOList = new ArrayList<>();
        for (User user : userList) {
            UserFunsDTO userFunsDTO = new UserFunsDTO();
            BeanUtils.copyProperties(user,userFunsDTO);
            userFunsDTO.setuId(user.getuId()+"");
            userFunsDTO.setIsfocus("1");
            userFunsDTOList.add(userFunsDTO);
        }

        return userFunsDTOList;
    }

    /**
     * 淳于永晨创建
     * 用于搜索
     * @param uNickname
     * @param userid
     * @return
     */
    @Override
    public List<UserFunsDTO> findUser(String uNickname,Integer userid) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUNicknameLike("%"+uNickname+"%");
        List<User> list = userMapper.selectByExample(userExample);
        List<UserFunsDTO> userFunsDTOS = new ArrayList<>();
        for (User user : list) {
            //搜索为当前用户则跳出
            if (user.getuId()==userid)continue;
            //copy
            UserFunsDTO userFunsDTO = new UserFunsDTO();
            BeanUtils.copyProperties(user,userFunsDTO);
            userFunsDTO.setuId(user.getuId()+"");
            //判断是否关注
            Map map = new HashMap();
            map.clear();
            map.put("befocus",user.getuId());
            map.put("focus",userid);
            Focus focus = focusMapper.isfocus(map);
            if (focus!=null){
                userFunsDTO.setIsfocus("1");
            }else{
                userFunsDTO.setIsfocus("0");
            }
            //添加集合
            userFunsDTOS.add(userFunsDTO);
        }
        return userFunsDTOS;
    }

    /**
     * 淳于永晨创建
     * 用于查询当前用户的粉丝列表
     * @param userid
     * @return
     */
    @Override
    public List<UserFunsDTO> findfuns(int userid) {
        Map map = new HashMap();
        map.put("uid",userid);
        List<User> userList = userMapper.findfuns(map);
        List<UserFunsDTO> userFunsDTOList = new ArrayList<>();
        for (User user : userList) {
            UserFunsDTO userFunsDTO = new UserFunsDTO();
            BeanUtils.copyProperties(user,userFunsDTO);
            userFunsDTO.setuId(user.getuId()+"");

            //判断是否关注
            map.clear();
            map.put("befocus",user.getuId());
            map.put("focus",userid);
            Focus focus = focusMapper.isfocus(map);
            if (focus!=null){
                userFunsDTO.setIsfocus("1");
            }else{
                userFunsDTO.setIsfocus("0");
            }


            userFunsDTOList.add(userFunsDTO);
        }

        return userFunsDTOList;
    }
}
