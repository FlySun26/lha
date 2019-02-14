package com.lhxm2.service.impl;

import com.lhxm2.dao.*;
import com.lhxm2.dto.DongTaiDTO;
import com.lhxm2.pojo.*;
import com.lhxm2.service.DongtaiService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class DongtaiServiceImpl implements DongtaiService {
    @Autowired
    private DongtaiMapper dongtaiMapper;
    @Autowired
    private LikedMapper likedMapper;
    @Autowired
    private DongtaiPicMapper dongtaiPicMapper;
    @Autowired
    private PinglunMapper pinglunMapper;
    @Autowired
    private HandAccountMapper handAccountMapper;
    @Autowired
    private HaMubanTextMapper haMubanTextMapper;
    @Autowired
    private BgimgMapper bgimgMapper;
    @Autowired
    private FontStyleMapper fontStyleMapper;

    @Override
    public Dongtai addDongtai(DongTaiDTO dongTaiDTO) {
        Dongtai record = new Dongtai();
        BeanUtils.copyProperties(dongTaiDTO,record);
        record.setDtLikenum(0);
        record.setDtLooknum(0);
        record.setDtPinglunnum(0);
        record.setDtShcnum(0);
        record.setDtZhuanfanum(0);
        record.setDtTime(new Date());
        dongtaiMapper.insert(record);
        System.out.println(record.getDtId());
        return record;

    }

    @Override
    @Transactional
    public int updateLikeDongtai(Integer likeState, Integer dtId, Integer uId) {
        //根据动态id去查询动态的喜欢量
        Dongtai dongtai = dongtaiMapper.selectByPrimaryKey(dtId);
        if(dongtai!=null){
            Dongtai record = new Dongtai();
            Liked like = new Liked();
            record.setDtId(dtId);
            like.setuId(uId);
            like.setDtId(dongtai.getDtId());
            if(likeState==1){//如果状态码为1喜欢量加1
                record.setDtLikenum(dongtai.getDtLikenum()+1);
                dongtaiMapper.updateByPrimaryKeySelective(record);
                //添加点赞
                likedMapper.insert(like);
            }else {//如果状态码不为1喜欢量减1
                if(dongtai.getDtLikenum()>0){
                    record.setDtLikenum(dongtai.getDtLikenum()-1);
                    dongtaiMapper.updateByPrimaryKeySelective(record);
                    //删除点赞
                    likedMapper.deleteByUserIdAndDongtaiId(like);
                    return 1;
                }else {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }


    //修改一下 要用list去存储查到的一组id 然后跟据一组id去查询 不能挨个查
    @Override
    public Map<String,Object> getAll() {
        //查询动态表
        List<Dongtai> dongtaiList = dongtaiMapper.getAll();

        Map map = new HashMap();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        //遍历动态表
        for (Dongtai dongtai : dongtaiList) {
            list1.add(dongtai.getDtId());
            list2.add(dongtai.getuId());
        }
        //手账
        List<HandAccount> handAccountList = handAccountMapper.getHandaccount(list2);
        map.put("Handaccount",handAccountList);
        for (HandAccount account : handAccountList) {
            list3.add(account.getBgId());
            list4.add(account.getHaId());
        }
        //手账文字
        List<HaMubanText> haMubanTextList = haMubanTextMapper.getHaMubanText(list4);
        for (HaMubanText haMubanText : haMubanTextList) {
            list5.add(haMubanText.getFsId());
        }
        //手账贴图

        //轮播图

        //动态图
        List<DongtaiPic> picList = dongtaiPicMapper.getDongtaiPic(list1);
        //动态评论
        List<Pinglun> pinglunList = pinglunMapper.getAllPinlun(list1);
        //手账壁纸
        List<Bgimg> bgimgList = bgimgMapper.getBgimg(list3);
        //手账字体
        //List<FontStyle> fontStyleList = fontStyleMapper.getFontstyle(list5);
        //map.put("Fontstyle",fontStyleList);
        map.put("HaMubanText",haMubanTextList);
        map.put("Bgimg",bgimgList);
        map.put("Dongtai",dongtaiList);
        map.put("DongtaiPic",picList);
        map.put("PingLun",pinglunList);
        return map;
    }

    @Override
    public Map getDongtai(Integer dtId) {
        Dongtai dongtai = dongtaiMapper.selectByPrimaryKey(dtId);
        DongtaiPic dongtaiPic = dongtaiPicMapper.selectByDtId(dtId);
        List<Pinglun> pinglun = pinglunMapper.selectByDtId(dtId);
        HandAccount handAccount = handAccountMapper.selectByPrimaryKey(dongtai.getHaId());
        Bgimg bgimg = bgimgMapper.selectByPrimaryKey(handAccount.getBgId());
        HaMubanText haMubanText = haMubanTextMapper.selectByPrimaryKey(handAccount.getHaId());
        //FontStyle fontStyle = fontStyleMapper.selectByPrimaryKey(haMubanText.getFsId());

        Map map = new HashMap();
        map.put("dongtai",dongtai);
        map.put("dongtaiPic",dongtaiPic);
        map.put("pinglun",pinglun);
        map.put("handAccount",handAccount);
        map.put("bgimg",bgimg);
        map.put("haMubanText",haMubanText);
        //map.put("fontStyle",fontStyle);

        return map;
    }



}
