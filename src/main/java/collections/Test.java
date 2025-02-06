package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext cls = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Employee e1 = (Employee)cls.getBean("Employee1");
        System.out.println(e1.getEmpName()+" \n"+ e1.getPhone()+"\n"+e1.getAddress());
        System.out.println(e1.getDetails());

    }
}
