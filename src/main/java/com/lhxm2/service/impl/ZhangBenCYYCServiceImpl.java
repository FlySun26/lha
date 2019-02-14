package com.lhxm2.service.impl;

import com.lhxm2.dao.*;
import com.lhxm2.dto.ZhangBenListDTO;
import com.lhxm2.dto.ZhangBenUserDTO;
import com.lhxm2.pojo.*;
import com.lhxm2.service.ZhangBenCYYCService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ZhangBenCYYCServiceImpl implements ZhangBenCYYCService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private FocusMapper focusMapper;

    @Autowired
    private ZhangbenMapper zhangbenMapper;

    @Autowired
    private HandAccountMapper handAccountMapper;

    @Autowired
    private ShoucangMapper shoucangMapper;

    @Override
    public ZhangBenUserDTO getzhangbenlist(int userid, int loginuserid) {
        if (userid==loginuserid){
            //查询自己
            //个人信息
            User user = userMapper.selectByPrimaryKey(userid);
            //粉丝数
            FocusExample focusExample = new FocusExample();
            FocusExample.Criteria criteria = focusExample.createCriteria();
            criteria.andFBefocusEqualTo(userid);
            long funsnum = focusMapper.countByExample(focusExample);
            //关注数
            FocusExample focusExample1 = new FocusExample();
            FocusExample.Criteria criteria1 = focusExample1.createCriteria();
            criteria1.andFFocusEqualTo(userid);
            long focusnum = focusMapper.countByExample(focusExample1);
            //copy
            ZhangBenUserDTO zhangBenUserDTO = new ZhangBenUserDTO();
            BeanUtils.copyProperties(user,zhangBenUserDTO);
            zhangBenUserDTO.setuId(user.getuId()+"");
            zhangBenUserDTO.setuLikenum(user.getuLikenum()+"");
            zhangBenUserDTO.setFocusnum(focusnum+"");
            zhangBenUserDTO.setFunsnum(funsnum+"");
            //账本列表
            ZhangbenExample zhangbenExample = new ZhangbenExample();
            ZhangbenExample.Criteria criteria2 = zhangbenExample.createCriteria();
            criteria2.andUIdEqualTo(userid);
            List<Zhangben> zhangbens = zhangbenMapper.selectByExample(zhangbenExample);
            List<ZhangBenListDTO> listDTOS = new ArrayList<>();
            for (Zhangben zhangben : zhangbens) {
                long hacount = 0;
                if (zhangben.getZbRole()==2){
                    //收藏本手账数量
                    ShoucangExample shoucangExample = new ShoucangExample();
                    ShoucangExample.Criteria criteria3 = shoucangExample.createCriteria();
                    criteria3.andUIdEqualTo(userid);
                    hacount = shoucangMapper.countByExample(shoucangExample);
                }else {
                    //账本内手账数量
                    HandAccountExample handAccountExample = new HandAccountExample();
                    HandAccountExample.Criteria criteria3 = handAccountExample.createCriteria();
                    criteria3.andZbIdEqualTo(zhangben.getZbId());
                    hacount = handAccountMapper.countByExample(handAccountExample);
                }
                //copy
                ZhangBenListDTO zhangBenListDTO = new ZhangBenListDTO();
                BeanUtils.copyProperties(zhangben,zhangBenListDTO);
                zhangBenListDTO.setZbId(zhangben.getZbId()+"");
                zhangBenListDTO.setHaCount(hacount+"");
                listDTOS.add(zhangBenListDTO);
            }
            //赋值给zhangBenUserDTO
            zhangBenUserDTO.setZblist(listDTOS);
            //返回
            return zhangBenUserDTO;
        }else {
            //查询他人
            //个人信息
            User user = userMapper.selectByPrimaryKey(userid);
            //粉丝数
            FocusExample focusExample = new FocusExample();
            FocusExample.Criteria criteria = focusExample.createCriteria();
            criteria.andFBefocusEqualTo(userid);
            long funsnum = focusMapper.countByExample(focusExample);
            //copy
            ZhangBenUserDTO zhangBenUserDTO = new ZhangBenUserDTO();
            BeanUtils.copyProperties(user,zhangBenUserDTO);
            zhangBenUserDTO.setuId(user.getuId()+"");
            zhangBenUserDTO.setuLikenum(user.getuLikenum()+"");
            zhangBenUserDTO.setFunsnum(funsnum+"");
            //账本列表
            ZhangbenExample zhangbenExample = new ZhangbenExample();
            ZhangbenExample.Criteria criteria2 = zhangbenExample.createCriteria();
            criteria2.andUIdEqualTo(userid);
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(1);
            //判断是否为好友
            Map map = new HashMap();
            map.put("focus",userid);
            map.put("befocus",loginuserid);
            boolean flag1 = focusMapper.isfocus(map)!=null;
            map.clear();
            map.put("focus",loginuserid);
            map.put("befocus",userid);
            boolean flag2 = focusMapper.isfocus(map)!=null;
            if (flag2){
                zhangBenUserDTO.setIsFocus("1");
            }else {
                zhangBenUserDTO.setIsFocus("0");
            }
            if (flag1&&flag2){
                //是好友
                integers.add(4);
            }else {
                //不是好友
            }
            criteria2.andZbRoleIn(integers);
            List<Zhangben> zhangbens = zhangbenMapper.selectByExample(zhangbenExample);

            List<ZhangBenListDTO> listDTOS = new ArrayList<>();
            for (Zhangben zhangben : zhangbens) {
                //账本内手账数量
                HandAccountExample handAccountExample = new HandAccountExample();
                HandAccountExample.Criteria criteria3 = handAccountExample.createCriteria();
                criteria3.andZbIdEqualTo(zhangben.getZbId());
                long hacount = handAccountMapper.countByExample(handAccountExample);
                //copy
                ZhangBenListDTO zhangBenListDTO = new ZhangBenListDTO();
                BeanUtils.copyProperties(zhangben,zhangBenListDTO);
                zhangBenListDTO.setZbId(zhangben.getZbId()+"");
                zhangBenListDTO.setHaCount(hacount+"");
                listDTOS.add(zhangBenListDTO);
            }
            //赋值给zhangBenUserDTO
            zhangBenUserDTO.setZblist(listDTOS);
            //返回
            return zhangBenUserDTO;
        }

    }
}
