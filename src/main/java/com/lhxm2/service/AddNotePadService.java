package com.lhxm2.service;

import com.lhxm2.pojo.Chartlet;
import com.lhxm2.pojo.UserChartlet;

import java.util.List;

public interface AddNotePadService {

    /*查询所有贴纸*/
    public List<Chartlet> findAll();

    /*通过贴纸id,uid关联用户*/
    int tagBindUser(UserChartlet userChartlet);

    /* 通过贴纸id,uid删除关联的用户 */
    int tagSplitUser(UserChartlet userChartlet);

    /* 通过cid,uid删除贴纸 */
    int delChartletByCid(Integer chartletid,Integer uid);
}
