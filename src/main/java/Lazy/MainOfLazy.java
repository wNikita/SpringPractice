package Lazy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainOfLazy {


        public static void main(String[] args) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            FirstBean firstBean = context.getBean(FirstBean.class);
            firstBean.test();
            context.close();
        }
    }

