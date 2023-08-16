package PrimaryAndQualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FullNameOfStudent {

    @Autowired

    public  FullName fullName;


    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void name()
    {
        System.out.println("THis is full name from fullNameOfStudent");
        fullName.fullName();
    }
}
