package com.whhp.mapper;

import com.whhp.entity.Invitation;
import com.whhp.util.Params;

import java.util.List;

/**
 * ASUS mjt
 * 2019/6/14
 */
public interface InvitationMapper {
    //查询全部
    List<Invitation> selectAll(Params params);

    //删除
    void deleteById(int id);

    //查询单条
    List<Invitation> selectAllById(Integer rid);






}
