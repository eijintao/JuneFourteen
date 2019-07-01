package com.whhp.controller;

import com.whhp.entity.Reply_detail;
import com.whhp.service.Reply_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * ASUS mjt
 * 2019/6/14
 */
@Controller
@RequestMapping("/reply_detail")
public class Reply_detailController {
    @Autowired
    private Reply_detailService reply_detailService;

    @RequestMapping("/replyAll")
    public String selectAll(Integer rid, Model model){
        List<Reply_detail> reply_details = reply_detailService.selectByExample1(rid);

        model.addAttribute("reply_details",reply_details);

        return "re/replyAllList";
    }

}
