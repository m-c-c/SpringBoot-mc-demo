package mc.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 声明这是配置文件对应的类
 * prefix前缀指向配置文件中的一级目录  food.rice =
 *
 */

@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig {
    private String rice;
    private String meat;
    private String[] sauce;
}
