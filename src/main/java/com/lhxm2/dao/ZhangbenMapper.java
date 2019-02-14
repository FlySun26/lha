package com.lhxm2.dao;

import com.lhxm2.pojo.Zhangben;
import com.lhxm2.pojo.ZhangbenExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ZhangbenMapper {
    long countByExample(ZhangbenExample example);

    int deleteByExample(ZhangbenExample example);

    int deleteByPrimaryKey(Integer zbId);

    int insert(Zhangben record);

    int insertSelective(Zhangben record);

    List<Zhangben> selectByExample(ZhangbenExample example);

    Zhangben selectByPrimaryKey(Integer zbId);

    int updateByExampleSelective(@Param("record") Zhangben record, @Param("example") ZhangbenExample example);

    int updateByExample(@Param("record") Zhangben record, @Param("example") ZhangbenExample example);

    int updateByPrimaryKeySelective(Zhangben record);

    int updateByPrimaryKey(Zhangben record);
}