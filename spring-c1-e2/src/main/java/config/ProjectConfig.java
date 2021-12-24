package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "beans")
public class ProjectConfig {
    @Bean
    boolean catVal(){
        return false;
    }
}
