package com.lhxm2.service;

import com.lhxm2.dto.DongTaiDTO;
import com.lhxm2.pojo.Dongtai;

import java.util.Map;

public interface DongtaiService {

    /**
     *发布动态
     */
    Dongtai addDongtai(DongTaiDTO dongTaiDTO);

    /**
     *喜欢点赞动态
     */
    int updateLikeDongtai(Integer likeState, Integer dtId, Integer uId);

    /**
     *世界动态
     */
    Map<String,Object> getAll();

    /**
     * 根据dtid查询动态详情
     * @param dtId
     * @return
     */
    Map getDongtai(Integer dtId);

}
