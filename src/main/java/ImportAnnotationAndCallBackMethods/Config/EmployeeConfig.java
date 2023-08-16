package ImportAnnotationAndCallBackMethods.Config;


import ImportAnnotationAndCallBackMethods.Service.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig {
    @Bean
//            (initMethod = "init",destroyMethod = "destroy")
    @Scope("prototype")
    public Employee employee() {
        return new Employee();
    }
}
