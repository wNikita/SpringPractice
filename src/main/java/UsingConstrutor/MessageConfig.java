package UsingConstrutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {


    @Bean
    public Communication communication() {
        return new Communication(sms());
    }

    @Bean
    public SMS sms() {
        return new MMS();
    }
}

