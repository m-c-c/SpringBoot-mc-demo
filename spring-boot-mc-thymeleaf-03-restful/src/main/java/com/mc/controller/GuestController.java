package com.mc.controller;

import com.mc.domain.Guest;
import com.mc.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")//放在类上说明类里的方法都是以次开头的
public class GuestController {

    @Autowired
    private GuestService service;

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String list(Model model){
        List<Guest> guestList = service.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    //@RequestMapping("/toAdd")
    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    //@RequestMapping("/guest/add")
    @PostMapping
    public String add(Guest guest){
        service.add(guest);
        return "redirect:/guest";
    }

    /**
     * 通过/guest/toUpdate/{name}
     * 其中的name属性值 通过注解@PathVariable("name")映射到方法中的属性中
     * 其中“name” 代表去url中查找的属性值
     * @param model
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        model.addAttribute("guest",service.getByName(name));
        return "update";
    }

    //@RequestMapping("/guest/update")
    @PutMapping
    public String update(Guest guest){
        service.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String toUpdate(@PathVariable("name") String name){
        service.delRole(name);
        return "redirect:/guest";
    }

}
