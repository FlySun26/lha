package com.lhxm2.dao;

import com.lhxm2.dto.PinglunConpressDTO;
import com.lhxm2.dto.PinglunDTO;
import com.lhxm2.pojo.Pinglun;
import com.lhxm2.pojo.PinglunExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PinglunMapper {
    long countByExample(PinglunExample example);

    int deleteByExample(PinglunExample example);

    int deleteByPrimaryKey(Integer plId);

    int insert(Pinglun record);

    int insertSelective(Pinglun record);

    List<Pinglun> selectByExample(PinglunExample example);

    Pinglun selectByPrimaryKey(Integer plId);

    int updateByExampleSelective(@Param("record") Pinglun record, @Param("example") PinglunExample example);

    int updateByExample(@Param("record") Pinglun record, @Param("example") PinglunExample example);

    int updateByPrimaryKeySelective(Pinglun record);

    int updateByPrimaryKey(Pinglun record);
    List<PinglunDTO> findPingLunDTO(Integer dongTaiId);

    List<PinglunConpressDTO> findCompressPl(Integer dtId);

    List<Pinglun> getAllPinlun(List<Integer> list1);

    List<Pinglun> selectByDtId(Integer dtId);
}
