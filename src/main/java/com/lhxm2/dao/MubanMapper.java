package com.lhxm2.dao;

import com.lhxm2.pojo.Muban;
import com.lhxm2.pojo.MubanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MubanMapper {
    long countByExample(MubanExample example);

    int deleteByExample(MubanExample example);

    int deleteByPrimaryKey(Integer muId);

    int insert(Muban record);

    int insertSelective(Muban record);

    List<Muban> selectByExample(MubanExample example);

    Muban selectByPrimaryKey(Integer muId);

    int updateByExampleSelective(@Param("record") Muban record, @Param("example") MubanExample example);

    int updateByExample(@Param("record") Muban record, @Param("example") MubanExample example);

    int updateByPrimaryKeySelective(Muban record);

    int updateByPrimaryKey(Muban record);
}