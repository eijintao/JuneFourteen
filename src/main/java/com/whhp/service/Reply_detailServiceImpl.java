package com.whhp.service;

import com.whhp.entity.Reply_detail;
import com.whhp.mapper.Reply_detailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ASUS mjt
 * 2019/6/14
 */
@Service
public class Reply_detailServiceImpl implements Reply_detailService {
    @Autowired
    private Reply_detailMapper reply_detailMapper;


    @Override
    public List<Reply_detail> selectByExample1(Integer rid) {
        return reply_detailMapper.selectByExample1(rid);
    }
}
