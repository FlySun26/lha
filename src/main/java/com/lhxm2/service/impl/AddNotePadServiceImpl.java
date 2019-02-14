package com.lhxm2.service.impl;

import com.lhxm2.dao.ChartletMapper;
import com.lhxm2.dao.UserChartletMapper;
import com.lhxm2.pojo.Chartlet;
import com.lhxm2.pojo.ChartletExample;
import com.lhxm2.pojo.UserChartlet;
import com.lhxm2.pojo.UserChartletExample;
import com.lhxm2.service.AddNotePadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddNotePadServiceImpl implements AddNotePadService {
    @Autowired
    private ChartletMapper chartletMapper;
    @Autowired
    private UserChartletMapper userChartletMapper;

    /*查询所有贴纸*/
    @Override
    public List<Chartlet> findAll() {
        ChartletExample example = new ChartletExample();
        List<Chartlet> chartlets = chartletMapper.selectByExample(example);
        return chartlets;
    }

    /*通过贴纸id,uid关联用户*/
    @Override
    public int tagBindUser(UserChartlet userChartlet) {
        ChartletExample example = new ChartletExample();
        ChartletExample.Criteria criteria = example.createCriteria();
        int res = userChartletMapper.insert(userChartlet);
        return res;
    }

    /* 通过贴纸id,uid删除关联的用户 */
    @Override
    public int tagSplitUser(UserChartlet userChartlet) {
        UserChartletExample example = new UserChartletExample();
        UserChartletExample.Criteria criteria = example.createCriteria();
        criteria.andCIdEqualTo(userChartlet.getcId());
        criteria.andUIdEqualTo(userChartlet.getuId());
        int res = userChartletMapper.deleteByExample(example);
        return res;
    }

    /* 通过cid删除贴纸 */
    @Transactional
    @Override
    public int delChartletByCid(Integer chartletid,Integer uid) {
        //1.删除chartlet表
        int res = chartletMapper.deleteByPrimaryKey(chartletid);
        //2.删除user_chartlet表
        UserChartletExample example = new UserChartletExample();
        UserChartletExample.Criteria criteria = example.createCriteria();
        criteria.andCIdEqualTo(chartletid);
        criteria.andUIdEqualTo(uid);
        int res2 = userChartletMapper.deleteByExample(example);
        return res+res2;
    }
}
