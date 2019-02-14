package com.lhxm2.dao;

import com.lhxm2.pojo.DongtaiPic;
import com.lhxm2.pojo.DongtaiPicExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DongtaiPicMapper {
    long countByExample(DongtaiPicExample example);

    int deleteByExample(DongtaiPicExample example);

    int deleteByPrimaryKey(Integer dpicId);

    int insert(DongtaiPic record);

    int insertSelective(DongtaiPic record);

    List<DongtaiPic> selectByExample(DongtaiPicExample example);

    DongtaiPic selectByPrimaryKey(Integer dpicId);

    int updateByExampleSelective(@Param("record") DongtaiPic record, @Param("example") DongtaiPicExample example);

    int updateByExample(@Param("record") DongtaiPic record, @Param("example") DongtaiPicExample example);

    int updateByPrimaryKeySelective(DongtaiPic record);

    int updateByPrimaryKey(DongtaiPic record);

    /**
     *根据动态id查询动态图片集合
     */
    List<DongtaiPic> getDongtaiPic(List dtId);

    /**
     * 根据动态id查询动态图片
     * @param dtId
     * @return
     */
    DongtaiPic selectByDtId(Integer dtId);
}