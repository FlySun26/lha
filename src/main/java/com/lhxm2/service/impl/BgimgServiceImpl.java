package com.lhxm2.service.impl;

import com.lhxm2.dao.BgimgMapper;
import com.lhxm2.dao.ChartletMapper;
import com.lhxm2.dao.MubanMapper;
import com.lhxm2.dao.UserMubanMapper;
import com.lhxm2.dto.BgimgDTO;
import com.lhxm2.dto.MubanDTO;
import com.lhxm2.dto.UserMubanDTO;
import com.lhxm2.pojo.Bgimg;
import com.lhxm2.pojo.Muban;
import com.lhxm2.pojo.MubanExample;
import com.lhxm2.pojo.UserMuban;
import com.lhxm2.service.MubanService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨河宽创建
 */
@Service
public class BgimgServiceImpl implements MubanService {
    @Autowired
    private MubanMapper mubanMapper;
    @Autowired
    private UserMubanMapper userMubanMapper;
    @Autowired
    private BgimgMapper bgimgMapper;
    @Autowired
    private ChartletMapper chartletMapper;
    /**
     * 查询全部模板
     * @return
     */
    @Override
    public List<MubanDTO> findAllMuban() {
        List<MubanDTO> list = new ArrayList<>();
        MubanExample mubanExample = new MubanExample();
        List<Muban> mubans = mubanMapper.selectByExample(mubanExample);
        for (Muban muban : mubans) {
            MubanDTO mubanDTO = new MubanDTO();
            BeanUtils.copyProperties(muban,mubanDTO);
            list.add(mubanDTO);
        }
        return list;
    }

    /**
     * 根据模板id查询模板
     * @param muId
     * @return
     */
    @Override
    public MubanDTO findMubanById(int muId) {
        Muban muban = mubanMapper.selectByPrimaryKey(muId);
        MubanDTO mubanDTO = new MubanDTO();
        BeanUtils.copyProperties(muban,mubanDTO);
        return mubanDTO;
    }

    /**
     * 根据用户id保存模板
     * @param userMubanDTO
     * @return
     */
    @Override
    public int savemuban(UserMubanDTO userMubanDTO) {
        UserMuban userMuban = new UserMuban();
        BeanUtils.copyProperties(userMubanDTO,userMuban);
        int i = userMubanMapper.insert(userMuban);
        return i;
    }

    /**
     * 根据模板id查询壁纸
     * @param muId
     * @return
     */
    @Override
    public BgimgDTO findBgimgById(int muId) {
        Muban muban = mubanMapper.selectByPrimaryKey(muId);
        //根据壁纸id查询壁纸
        Bgimg bgimg = bgimgMapper.selectByPrimaryKey(muban.getBgId());
        //根据贴图id查询贴图
        return null;
    }
}
