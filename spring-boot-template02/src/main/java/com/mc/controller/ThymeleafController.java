package com.mc.controller;

import com.mc.domain.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class ThymeleafController {

    @RequestMapping("thyme")
    public String index(Model model){
        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("huang");
        restaurant.setChef("林大厨");
        model.addAttribute("restaurant",restaurant);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("now",new Date().toString());
        return "/thymeleaf/welcome";
    }


}
