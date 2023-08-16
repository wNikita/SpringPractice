package UsingJavaConfig;

import UsingAnnotation.AppConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages="UsingJavaConfig")
public class Config
{
    @Bean
//    @Scope("singleton")
    public HeroHonda heroHonda() {
        return new HeroHonda();
    }

    @Bean
    public FuelType fuelType()
    {
        return new Bike();
    }
}
