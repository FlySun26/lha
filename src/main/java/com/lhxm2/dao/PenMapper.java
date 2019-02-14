package com.lhxm2.dao;

import com.lhxm2.pojo.Pen;
import com.lhxm2.pojo.PenExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PenMapper {
    long countByExample(PenExample example);

    int deleteByExample(PenExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Pen record);

    int insertSelective(Pen record);

    List<Pen> selectByExample(PenExample example);

    Pen selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Pen record, @Param("example") PenExample example);

    int updateByExample(@Param("record") Pen record, @Param("example") PenExample example);

    int updateByPrimaryKeySelective(Pen record);

    int updateByPrimaryKey(Pen record);
}