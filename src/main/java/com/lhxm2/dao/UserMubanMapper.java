package com.lhxm2.dao;

import com.lhxm2.pojo.UserMuban;
import com.lhxm2.pojo.UserMubanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMubanMapper {
    long countByExample(UserMubanExample example);

    int deleteByExample(UserMubanExample example);

    int deleteByPrimaryKey(Integer umId);

    int insert(UserMuban record);

    int insertSelective(UserMuban record);

    List<UserMuban> selectByExample(UserMubanExample example);

    UserMuban selectByPrimaryKey(Integer umId);

    int updateByExampleSelective(@Param("record") UserMuban record, @Param("example") UserMubanExample example);

    int updateByExample(@Param("record") UserMuban record, @Param("example") UserMubanExample example);

    int updateByPrimaryKeySelective(UserMuban record);

    int updateByPrimaryKey(UserMuban record);
}