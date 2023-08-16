package ImportAnnotationAndCallBackMethods.Service;

public class Employee  {
    public void addEmployee()
    {
        System.out.println("Employee added");
    }


//    @PostConstruct
    public void init()
    {
        System.out.println("It is init from employee");
    }

//    @PreDestroy
    public void destroy()
    {
        System.out.println("it is destroy from employee");
    }


}
