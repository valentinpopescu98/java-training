package config;

import beans.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {
    @Bean
    public Cat cat(){
        return new Cat("Regina");
    }

    @Bean
    public String ownerName(){
        return "Patrocle";
    }
}
