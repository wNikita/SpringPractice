package ForConfigrationAndPrototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

//@Configuration
public class MyConfiguration {

    @Bean
//    @Scope("prototype")
    public MyBean myBean() {
        return new MyBean();
    }

    @Bean
    public MyBeanConsumer myBeanConsumer() {
        return new MyBeanConsumer(myBean());
    }
}
