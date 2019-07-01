package com.whhp.controller;

import com.github.pagehelper.PageInfo;
import com.whhp.entity.Invitation;
import com.whhp.service.InvitationService;
import com.whhp.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.List;

/**
 * ASUS mjt
 * 2019/6/14
 */
@Controller
@RequestMapping("/invitationController")
public class InvitationController {
    @Autowired
    private InvitationService invitationService;

    @RequestMapping("/selectAll1")
    public String selectAllinvitation(Model model, Params params){

        List<Invitation> invitationList = invitationService.selectAll(params);

        PageInfo<Invitation> pageInfo=new PageInfo<>(invitationList);

        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("params",params);

        return  "invitation/InvitationList";
    }

    @RequestMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id){
        invitationService.deleteById(id);
        return "redirect:/invitationController/selectAll1";
    }

   /* @RequestMapping("/selectAllById")
    public String selectAllById(Integer rid,Model model){
        List<Invitation> list = invitationService.selectAllById(rid);

        model.addAttribute("list",list);

        return "re/replyAllList";

    }*/



}
