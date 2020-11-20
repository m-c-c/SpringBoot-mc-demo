package mc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Controller + ResponseBody 组合 看源码
public class JsonController {

    @RequestMapping("/json")
    public String json(){
        return "hello json";
    }


}
