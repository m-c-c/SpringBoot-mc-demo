package mc.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 声明这是配置文件对应的类
 * prefix前缀指向配置文件中的一级目录  food.rice =
 *
 */
@ConfigurationProperties(prefix = "food")
public class FoodConfig {
    private String rice;
    private String meat;

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
