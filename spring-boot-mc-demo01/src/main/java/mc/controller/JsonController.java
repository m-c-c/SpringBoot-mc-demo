package mc.controller;

import mc.bean.SpicyChicken;
import mc.bean.Vegetables;
import mc.config.FoodConfig;
import mc.bean.Food;
import mc.config.SpicyChickenConfig;
import mc.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 */
@RestController  //Controller + ResponseBody 组合 看源码
public class JsonController {

//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        food.setSauce(foodConfig.getSauce());
        return food;
    }


    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables v = new Vegetables();
        v.setPotato(vegetablesConfig.getPotato());
        v.setEggplant(vegetablesConfig.getEggplant());
        v.setGreenpeper(vegetablesConfig.getGreenpeper());
        return v;
    }


    @Autowired
    private SpicyChickenConfig spicyChickenConfig;

    @RequestMapping("/spicyChicken")
    public SpicyChicken spicyChicken(){
        SpicyChicken s = new SpicyChicken();
        s.setPepper(spicyChickenConfig.getPepper());
        s.setChicken(spicyChickenConfig.getChicken());
        s.setBeer(spicyChickenConfig.getBeer());
        return s;
    }




}
