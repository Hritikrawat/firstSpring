package stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import standalonecollections.Student;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
//      Customer s = (Customer) context.getBean("customer");                     //while using @Component spring creates Object, which is the camelcase of ClassName
        Customer s = context.getBean("cus",Customer.class);         //we can also define the reference variable as an argument of @Component("cus")
        System.out.println(s);
        System.out.println(s.getPno().getClass().getName());

    }
}
