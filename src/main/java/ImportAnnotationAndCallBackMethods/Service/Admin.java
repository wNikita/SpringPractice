package ImportAnnotationAndCallBackMethods.Service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Admin{
//        implements InitializingBean, DisposableBean {

    public void addAdmin()
    {
        System.out.println("Admin added");
    }


//    @PostConstruct
    public void init()
    {
        System.out.println("It is init from admin");
    }

//    @PreDestroy
    public void destroy()
    {
        System.out.println("it is destroy from admin");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("it is init from admin");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//
//    }
}
