package UsingJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HeroHonda {

    @Autowired
    FuelType fuelType;

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void getName()
    {
        System.out.println("This is hero honda showroom");
        fuelType.process();
    }
}
