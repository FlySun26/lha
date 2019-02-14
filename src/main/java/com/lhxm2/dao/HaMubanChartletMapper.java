package com.lhxm2.dao;

import com.lhxm2.pojo.HaMubanChartlet;
import com.lhxm2.pojo.HaMubanChartletExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HaMubanChartletMapper {
    long countByExample(HaMubanChartletExample example);

    int deleteByExample(HaMubanChartletExample example);

    int deleteByPrimaryKey(Integer hmcId);

    int insert(HaMubanChartlet record);

    int insertSelective(HaMubanChartlet record);

    List<HaMubanChartlet> selectByExample(HaMubanChartletExample example);

    HaMubanChartlet selectByPrimaryKey(Integer hmcId);

    int updateByExampleSelective(@Param("record") HaMubanChartlet record, @Param("example") HaMubanChartletExample example);

    int updateByExample(@Param("record") HaMubanChartlet record, @Param("example") HaMubanChartletExample example);

    int updateByPrimaryKeySelective(HaMubanChartlet record);

    int updateByPrimaryKey(HaMubanChartlet record);
}