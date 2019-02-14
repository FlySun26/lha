package com.lhxm2.dao;

import com.lhxm2.pojo.Liked;
import java.util.List;

import com.lhxm2.pojo.LikedExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LikedMapper {
    long countByExample(LikedExample example);

    int deleteByExample(LikedExample example);

    int deleteByPrimaryKey(Integer likeId);

    int insert(Liked record);

    int insertSelective(Liked record);

    List<Liked> selectByExample(LikedExample example);

    Liked selectByPrimaryKey(Integer likeId);

    int updateByExampleSelective(@Param("record") Liked record, @Param("example") LikedExample example);

    int updateByExample(@Param("record") Liked record, @Param("example") LikedExample example);

    int updateByPrimaryKeySelective(Liked record);

    int updateByPrimaryKey(Liked record);

    /**
     *根据uid和did删除喜欢
     */
    void deleteByUserIdAndDongtaiId(Liked like);
}