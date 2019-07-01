package com.whhp.mapper;

import com.whhp.entity.Reply_detail;
import com.whhp.entity.Reply_detailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Reply_detailMapper {
    int countByExample(Reply_detailExample example);

    int deleteByExample(Reply_detailExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Reply_detail record);

    int insertSelective(Reply_detail record);

    List<Reply_detail> selectByExample(Reply_detailExample example);

    Reply_detail selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Reply_detail record, @Param("example") Reply_detailExample example);

    int updateByExample(@Param("record") Reply_detail record, @Param("example") Reply_detailExample example);

    int updateByPrimaryKeySelective(Reply_detail record);

    int updateByPrimaryKey(Reply_detail record);

    List<Reply_detail> selectByExample1(Integer rid);
}