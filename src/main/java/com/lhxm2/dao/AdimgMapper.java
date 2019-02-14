package com.lhxm2.dao;

import com.lhxm2.pojo.Adimg;
import com.lhxm2.pojo.AdimgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AdimgMapper {
    long countByExample(AdimgExample example);

    int deleteByExample(AdimgExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(Adimg record);

    int insertSelective(Adimg record);

    List<Adimg> selectByExample(AdimgExample example);

    Adimg selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") Adimg record, @Param("example") AdimgExample example);

    int updateByExample(@Param("record") Adimg record, @Param("example") AdimgExample example);

    int updateByPrimaryKeySelective(Adimg record);

    int updateByPrimaryKey(Adimg record);
}