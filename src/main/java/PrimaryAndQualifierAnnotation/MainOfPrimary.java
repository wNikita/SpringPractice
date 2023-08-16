package PrimaryAndQualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainOfPrimary {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Confi.class);
      FullNameOfStudent fullNameOfStudent=applicationContext.getBean(FullNameOfStudent.class);
      fullNameOfStudent.name();


    }
}
