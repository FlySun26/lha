package com.lhxm2.dao;

import com.lhxm2.pojo.FontStyle;
import com.lhxm2.pojo.FontStyleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FontStyleMapper {
    long countByExample(FontStyleExample example);

    int deleteByExample(FontStyleExample example);

    int deleteByPrimaryKey(Integer fsId);

    int insert(FontStyle record);

    int insertSelective(FontStyle record);

    List<FontStyle> selectByExample(FontStyleExample example);

    FontStyle selectByPrimaryKey(Integer fsId);

    int updateByExampleSelective(@Param("record") FontStyle record, @Param("example") FontStyleExample example);

    int updateByExample(@Param("record") FontStyle record, @Param("example") FontStyleExample example);

    int updateByPrimaryKeySelective(FontStyle record);

    int updateByPrimaryKey(FontStyle record);

    /**
     *查询ziti
     */
    //List<FontStyle> getFontstyle(List fsId);
}