package com.lhxm2.dao;

import com.lhxm2.pojo.Tongzhi;
import com.lhxm2.pojo.TongzhiExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TongzhiMapper {
    long countByExample(TongzhiExample example);

    int deleteByExample(TongzhiExample example);

    int deleteByPrimaryKey(Integer tzId);

    int insert(Tongzhi record);

    int insertSelective(Tongzhi record);

    List<Tongzhi> selectByExample(TongzhiExample example);

    Tongzhi selectByPrimaryKey(Integer tzId);

    int updateByExampleSelective(@Param("record") Tongzhi record, @Param("example") TongzhiExample example);

    int updateByExample(@Param("record") Tongzhi record, @Param("example") TongzhiExample example);

    int updateByPrimaryKeySelective(Tongzhi record);

    int updateByPrimaryKey(Tongzhi record);
}