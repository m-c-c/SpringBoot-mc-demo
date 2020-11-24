package mc.controller;

import mc.config.FoodConfig;
import mc.domain.Food;
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
        Food food = new Food(foodConfig.getRice(),foodConfig.getMeat());
        return food;
    }


}
