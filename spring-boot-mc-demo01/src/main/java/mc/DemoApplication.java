package mc;


//程序入口
//声明我们的入口类  并且声明是SpringBoot项目

import mc.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 程序入口
 * 声明我们的入口类  并且声明是SpringBoot项目
 *
 * 告诉主程序入口 要自动引入配置文件 配置文件对应的类作为他的参数
 */
@SpringBootApplication
@EnableConfigurationProperties(FoodConfig.class)
public class DemoApplication {

    public static void main(String[] args) {
        //使用了SpringApplication类的静态方法 启动SpringBoot程序
        SpringApplication.run(DemoApplication.class, args);
    }
}