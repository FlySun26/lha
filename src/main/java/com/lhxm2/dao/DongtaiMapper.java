package com.lhxm2.dao;

import com.lhxm2.pojo.Dongtai;
import com.lhxm2.pojo.DongtaiExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DongtaiMapper {
    long countByExample(DongtaiExample example);

    int deleteByExample(DongtaiExample example);

    int deleteByPrimaryKey(Integer dtId);

    int insert(Dongtai record);

    int insertSelective(Dongtai record);

    List<Dongtai> selectByExample(DongtaiExample example);

    Dongtai selectByPrimaryKey(Integer dtId);

    int updateByExampleSelective(@Param("record") Dongtai record, @Param("example") DongtaiExample example);

    int updateByExample(@Param("record") Dongtai record, @Param("example") DongtaiExample example);

    int updateByPrimaryKeySelective(Dongtai record);

    int updateByPrimaryKey(Dongtai record);

    /**
     *全查
     */
    List<Dongtai> getAll();

}