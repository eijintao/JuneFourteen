package com.whhp.service;

import com.whhp.entity.Reply_detail;

import java.util.List;

/**
 * ASUS mjt
 * 2019/6/14
 */
public interface Reply_detailService {
      //查看回复
    List<Reply_detail> selectByExample1(Integer rid);
}
