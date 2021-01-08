package mc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "spicychicken")
public class SpicyChickenConfig {
    private String pepper;
    private String chicken;
    private String beer;
}
