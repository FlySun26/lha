package com.lhxm2.dao;

import com.lhxm2.pojo.Shoucang;
import com.lhxm2.pojo.ShoucangExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ShoucangMapper {
    long countByExample(ShoucangExample example);

    int deleteByExample(ShoucangExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(Shoucang record);

    int insertSelective(Shoucang record);

    List<Shoucang> selectByExample(ShoucangExample example);

    Shoucang selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") Shoucang record, @Param("example") ShoucangExample example);

    int updateByExample(@Param("record") Shoucang record, @Param("example") ShoucangExample example);

    int updateByPrimaryKeySelective(Shoucang record);

    int updateByPrimaryKey(Shoucang record);
}