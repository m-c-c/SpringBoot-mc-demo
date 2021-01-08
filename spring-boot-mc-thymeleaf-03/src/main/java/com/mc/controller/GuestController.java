package com.mc.controller;

import com.mc.domain.Guest;
import com.mc.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GuestController {

    @Autowired
    private GuestService service;

    @RequestMapping("/guest/list")
    public String list(Model model){
        List<Guest> guestList = service.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/guest/add")
    public String add(Guest guest){
        service.add(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/toUpdate")
    public String toUpdate(Model model,String name){
        model.addAttribute("guest",service.getByName(name));
        return "update";
    }

    @RequestMapping("/guest/update")
    public String update(Guest guest){
        service.update(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/toDel")
    public String toUpdate(String name){
        service.delRole(name);
        return "redirect:/guest/list";
    }

}
