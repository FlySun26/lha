package com.lhxm2.dao;

import com.lhxm2.pojo.ZbPinglun;
import com.lhxm2.pojo.ZbPinglunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbPinglunMapper {
    long countByExample(ZbPinglunExample example);

    int deleteByExample(ZbPinglunExample example);

    int deleteByPrimaryKey(Integer zpId);

    int insert(ZbPinglun record);

    int insertSelective(ZbPinglun record);

    List<ZbPinglun> selectByExample(ZbPinglunExample example);

    ZbPinglun selectByPrimaryKey(Integer zpId);

    int updateByExampleSelective(@Param("record") ZbPinglun record, @Param("example") ZbPinglunExample example);

    int updateByExample(@Param("record") ZbPinglun record, @Param("example") ZbPinglunExample example);

    int updateByPrimaryKeySelective(ZbPinglun record);

    int updateByPrimaryKey(ZbPinglun record);
}