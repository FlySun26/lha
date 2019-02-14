package com.lhxm2.dao;

import com.lhxm2.pojo.ZbLike;
import com.lhxm2.pojo.ZbLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbLikeMapper {
    long countByExample(ZbLikeExample example);

    int deleteByExample(ZbLikeExample example);

    int deleteByPrimaryKey(Integer zlId);

    int insert(ZbLike record);

    int insertSelective(ZbLike record);

    List<ZbLike> selectByExample(ZbLikeExample example);

    ZbLike selectByPrimaryKey(Integer zlId);

    int updateByExampleSelective(@Param("record") ZbLike record, @Param("example") ZbLikeExample example);

    int updateByExample(@Param("record") ZbLike record, @Param("example") ZbLikeExample example);

    int updateByPrimaryKeySelective(ZbLike record);

    int updateByPrimaryKey(ZbLike record);
}