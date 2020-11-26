package com.mc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class FTLController {

    @RequestMapping("/ftl")
    public String index(Model model){
        model.addAttribute("now",new Date().toString());
        return "/freemarker/index";
    }
}
