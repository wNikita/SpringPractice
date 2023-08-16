package UsingJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);

        HeroHonda heroHonda=applicationContext.getBean(HeroHonda.class);
        heroHonda.getName();
    }
}
