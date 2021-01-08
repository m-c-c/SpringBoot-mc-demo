package com.mc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import tk.mybatis.spring.annotation.MapperScan;

//@MapperScan("com.mc.mappers")
//@MapperScan("com.mc.mappers")  //在入口中添加mapper扫描就不用在每个mapper上加注解了

@SpringBootApplication

public class SpringBootMcOrmMybatis04Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMcOrmMybatis04Application.class, args);
    }
}
