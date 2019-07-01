package com.whhp.service;

import com.github.pagehelper.PageInfo;
import com.whhp.entity.Invitation;
import com.whhp.util.Params;

import java.util.List;

/**
 * ASUS mjt
 * 2019/6/14
 */
public interface InvitationService {



    //删除
    void deleteById(int id);

    //查询全部
    List<Invitation> selectAll(Params params);

    //查询单条
    List<Invitation> selectAllById(Integer rid);

}
