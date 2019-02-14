package com.lhxm2.dao;

import com.lhxm2.pojo.UserChartlet;
import com.lhxm2.pojo.UserChartletExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserChartletMapper {
    long countByExample(UserChartletExample example);

    int deleteByExample(UserChartletExample example);

    int deleteByPrimaryKey(Integer uclId);

    int insert(UserChartlet record);

    int insertSelective(UserChartlet record);

    List<UserChartlet> selectByExample(UserChartletExample example);

    UserChartlet selectByPrimaryKey(Integer uclId);

    int updateByExampleSelective(@Param("record") UserChartlet record, @Param("example") UserChartletExample example);

    int updateByExample(@Param("record") UserChartlet record, @Param("example") UserChartletExample example);

    int updateByPrimaryKeySelective(UserChartlet record);

    int updateByPrimaryKey(UserChartlet record);
}