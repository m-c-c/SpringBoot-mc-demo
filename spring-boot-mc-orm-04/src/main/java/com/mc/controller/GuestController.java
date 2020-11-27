package com.mc.controller;

import com.mc.bean.Guest;
import com.mc.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService service;

    @GetMapping
    public String list(Model model){
        List<Guest> guestList = service.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }


}
