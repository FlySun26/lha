package com.lhxm2.dao;

import com.lhxm2.pojo.HaMubanText;
import com.lhxm2.pojo.HaMubanTextExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HaMubanTextMapper {
    long countByExample(HaMubanTextExample example);

    int deleteByExample(HaMubanTextExample example);

    int deleteByPrimaryKey(Integer hmtId);

    int insert(HaMubanText record);

    int insertSelective(HaMubanText record);

    List<HaMubanText> selectByExample(HaMubanTextExample example);

    HaMubanText selectByPrimaryKey(Integer hmtId);

    int updateByExampleSelective(@Param("record") HaMubanText record, @Param("example") HaMubanTextExample example);

    int updateByExample(@Param("record") HaMubanText record, @Param("example") HaMubanTextExample example);

    int updateByPrimaryKeySelective(HaMubanText record);

    int updateByPrimaryKey(HaMubanText record);

    /**
     * 根据手账id查询手账文字
     * @param haId
     * @return
     */
    List<HaMubanText> getHaMubanText(List haId);
}