package PrimaryAndQualifierAnnotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Surname implements  FullName{
    @Override
    public void fullName() {
        System.out.println("Waghaskar");
    }
}
