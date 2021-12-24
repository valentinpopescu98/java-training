package config;

import beans.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Primary
    @Bean
    Cat cat1(){
        return new Cat();
    }

    @Bean
    Cat cat2(){
        return new Cat("Jon");
    }
}
