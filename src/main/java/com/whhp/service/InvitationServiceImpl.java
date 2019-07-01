package com.whhp.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whhp.entity.Invitation;
import com.whhp.mapper.InvitationMapper;

import com.whhp.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ASUS mjt
 * 2019/6/14
 */

@Service
public class InvitationServiceImpl implements InvitationService {

    @Autowired
    private InvitationMapper invitationMapper;

    @Override
    public List<Invitation> selectAllById(Integer rid) {
        return invitationMapper.selectAllById(rid);
    }

    //删除
    @Override
    public void deleteById(int id) {
        invitationMapper.deleteById(id);
    }

    //查询全部和分页一起
    @Override
    public List<Invitation> selectAll(Params params) {
        //开启分页
        PageHelper.startPage(params.getPageNum(),params.getPageSize());
        //判定起始页
        if(params.getPageNum()==0){
            params.setPageNum(1);
        }
        //调用dao层查询全部。
        return invitationMapper.selectAll(params);
    }

}
