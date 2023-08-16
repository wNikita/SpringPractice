package Lazy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

    @Bean
    public FirstBean firstBean() {
        return new FirstBean();
    }


    @Lazy
    @Bean
    public SecondBean secondBean() {
        return new SecondBean();
    }
}

