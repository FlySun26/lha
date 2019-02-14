package com.lhxm2.dao;

import com.lhxm2.pojo.Focus;
import com.lhxm2.pojo.FocusExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FocusMapper {
    long countByExample(FocusExample example);

    int deleteByExample(FocusExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(Focus record);

    int insertSelective(Focus record);

    List<Focus> selectByExample(FocusExample example);

    Focus selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") Focus record, @Param("example") FocusExample example);

    int updateByExample(@Param("record") Focus record, @Param("example") FocusExample example);

    int updateByPrimaryKeySelective(Focus record);

    int updateByPrimaryKey(Focus record);

    /**
     * 淳于永晨
     * 是否关注
     * @param map
     * @return
     */
    Focus isfocus(Map map);
}