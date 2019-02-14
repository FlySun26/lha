package com.lhxm2.dao;

import com.lhxm2.pojo.Chartlet;
import com.lhxm2.pojo.ChartletExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ChartletMapper {
    long countByExample(ChartletExample example);

    int deleteByExample(ChartletExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Chartlet record);

    int insertSelective(Chartlet record);

    List<Chartlet> selectByExample(ChartletExample example);

    Chartlet selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Chartlet record, @Param("example") ChartletExample example);

    int updateByExample(@Param("record") Chartlet record, @Param("example") ChartletExample example);

    int updateByPrimaryKeySelective(Chartlet record);

    int updateByPrimaryKey(Chartlet record);
}