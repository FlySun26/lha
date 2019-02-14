package com.lhxm2.dao;

import com.lhxm2.pojo.HaMubanPenimg;
import com.lhxm2.pojo.HaMubanPenimgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HaMubanPenimgMapper {
    long countByExample(HaMubanPenimgExample example);

    int deleteByExample(HaMubanPenimgExample example);

    int deleteByPrimaryKey(Integer hmpId);

    int insert(HaMubanPenimg record);

    int insertSelective(HaMubanPenimg record);

    List<HaMubanPenimg> selectByExample(HaMubanPenimgExample example);

    HaMubanPenimg selectByPrimaryKey(Integer hmpId);

    int updateByExampleSelective(@Param("record") HaMubanPenimg record, @Param("example") HaMubanPenimgExample example);

    int updateByExample(@Param("record") HaMubanPenimg record, @Param("example") HaMubanPenimgExample example);

    int updateByPrimaryKeySelective(HaMubanPenimg record);

    int updateByPrimaryKey(HaMubanPenimg record);
}