package com.lhxm2.dao;

import com.lhxm2.pojo.Bgimg;
import com.lhxm2.pojo.BgimgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BgimgMapper {
    long countByExample(BgimgExample example);

    int deleteByExample(BgimgExample example);

    int deleteByPrimaryKey(Integer bgId);

    int insert(Bgimg record);

    int insertSelective(Bgimg record);

    List<Bgimg> selectByExample(BgimgExample example);

    Bgimg selectByPrimaryKey(Integer bgId);

    int updateByExampleSelective(@Param("record") Bgimg record, @Param("example") BgimgExample example);

    int updateByExample(@Param("record") Bgimg record, @Param("example") BgimgExample example);

    int updateByPrimaryKeySelective(Bgimg record);

    int updateByPrimaryKey(Bgimg record);

    /**
     * 查手账壁纸
     * @param bgId
     * @return
     */
    List<Bgimg> getBgimg(List bgId);
}