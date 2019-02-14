package com.lhxm2.dao;

import com.lhxm2.pojo.HandAccount;
import com.lhxm2.pojo.HandAccountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HandAccountMapper {
    long countByExample(HandAccountExample example);

    int deleteByExample(HandAccountExample example);

    int deleteByPrimaryKey(Integer haId);

    int insert(HandAccount record);

    int insertSelective(HandAccount record);

    List<HandAccount> selectByExample(HandAccountExample example);

    HandAccount selectByPrimaryKey(Integer haId);

    int updateByExampleSelective(@Param("record") HandAccount record, @Param("example") HandAccountExample example);

    int updateByExample(@Param("record") HandAccount record, @Param("example") HandAccountExample example);

    int updateByPrimaryKeySelective(HandAccount record);

    int updateByPrimaryKey(HandAccount record);

    /**
     * 根据动态id查询手账
     * @param uId
     * @return
     */
    List<HandAccount> getHandaccount(List uId);

}