package com.lhxm2.dao;

import com.lhxm2.pojo.UserBgimg;
import com.lhxm2.pojo.UserBgimgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserBgimgMapper {
    long countByExample(UserBgimgExample example);

    int deleteByExample(UserBgimgExample example);

    int deleteByPrimaryKey(Integer ubgId);

    int insert(UserBgimg record);

    int insertSelective(UserBgimg record);

    List<UserBgimg> selectByExample(UserBgimgExample example);

    UserBgimg selectByPrimaryKey(Integer ubgId);

    int updateByExampleSelective(@Param("record") UserBgimg record, @Param("example") UserBgimgExample example);

    int updateByExample(@Param("record") UserBgimg record, @Param("example") UserBgimgExample example);

    int updateByPrimaryKeySelective(UserBgimg record);

    int updateByPrimaryKey(UserBgimg record);
}