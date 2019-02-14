package com.lhxm2.service.impl;

import com.lhxm2.dao.DongtaiPicMapper;
import com.lhxm2.pojo.DongtaiPic;
import com.lhxm2.service.DongtaiPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DongtaiPicServiceImpl implements DongtaiPicService {
    @Autowired
    private DongtaiPicMapper dongtaiPicMapper;
    @Override
    public void insert(DongtaiPic dongtaiPic) {
        dongtaiPicMapper.insert(dongtaiPic);
    }
}
