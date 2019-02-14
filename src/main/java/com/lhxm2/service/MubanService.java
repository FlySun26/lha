package com.lhxm2.service;

import com.lhxm2.dto.BgimgDTO;
import com.lhxm2.dto.MubanDTO;
import com.lhxm2.dto.UserMubanDTO;
import com.lhxm2.pojo.UserMuban;

import java.util.List;

/**
 * 杨河宽创建
 */
public interface MubanService {
    /**
     * 查询全部模板
     * @return
     */
    public List<MubanDTO> findAllMuban();

    /**
     * 根据id查询模板
     * @param muId
     * @return
     */
    public MubanDTO findMubanById(int muId);

    /**
     * 根据用户id保存模板
     * @param userMubanDTO
     * @return
     */
    public int savemuban(UserMubanDTO userMubanDTO);

    /**
     * 根据模板id查询壁纸
     * @param muId
     * @return
     */
    public BgimgDTO findBgimgById(int muId);
}
