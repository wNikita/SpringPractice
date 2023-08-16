package ImportAnnotationAndCallBackMethods.Config;

import ImportAnnotationAndCallBackMethods.Service.Admin;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(value = {EmployeeConfig.class})
public class AdminConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope(scopeName = "prototype")
    public Admin admin()
    {
        return new Admin();
    }


}
