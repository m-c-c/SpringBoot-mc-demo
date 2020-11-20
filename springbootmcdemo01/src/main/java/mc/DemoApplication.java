package mc;


//程序入口
//声明我们的入口类  并且声明是SpringBoot项目

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //使用了SpringApplication类的静态方法 启动SpringBoot程序
        SpringApplication.run(DemoApplication.class, args);
    }
}