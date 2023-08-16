package ImportAnnotationAndCallBackMethods;

import ImportAnnotationAndCallBackMethods.Config.AdminConfig;
import ImportAnnotationAndCallBackMethods.Service.Admin;
import ImportAnnotationAndCallBackMethods.Service.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainOfImportAnnotation {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AdminConfig.class);
        Employee employee = applicationContext.getBean(Employee.class);
        employee.addEmployee();
        Admin admin=applicationContext.getBean(Admin.class);
        admin.addAdmin();

        Boolean singlton=applicationContext.isPrototype("employee");
        System.out.println(singlton);

        boolean prototype=applicationContext.isPrototype("admin");
        System.out.println(prototype);
    }
}