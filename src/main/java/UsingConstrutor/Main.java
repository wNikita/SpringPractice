package UsingConstrutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MessageConfig.class);
        Communication communication=applicationContext.getBean(Communication.class);
        communication.message();
    }
}