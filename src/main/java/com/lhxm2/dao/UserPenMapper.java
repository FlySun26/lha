package com.lhxm2.dao;

import com.lhxm2.pojo.UserPen;
import com.lhxm2.pojo.UserPenExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserPenMapper {
    long countByExample(UserPenExample example);

    int deleteByExample(UserPenExample example);

    int deleteByPrimaryKey(Integer upenId);

    int insert(UserPen record);

    int insertSelective(UserPen record);

    List<UserPen> selectByExample(UserPenExample example);

    UserPen selectByPrimaryKey(Integer upenId);

    int updateByExampleSelective(@Param("record") UserPen record, @Param("example") UserPenExample example);

    int updateByExample(@Param("record") UserPen record, @Param("example") UserPenExample example);

    int updateByPrimaryKeySelective(UserPen record);

    int updateByPrimaryKey(UserPen record);
}