package UsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        Mobile mobile=applicationContext.getBean(Mobile.class);
        mobile.config();
    }
}
