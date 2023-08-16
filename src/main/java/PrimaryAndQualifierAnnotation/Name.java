package PrimaryAndQualifierAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Name implements FullName{


    @Override
    public void fullName() {
        System.out.println("Nikita");
    }
}
