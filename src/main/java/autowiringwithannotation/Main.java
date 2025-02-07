package autowiringwithannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowirewithannotation.xml");
        Order order = context.getBean("order1", Order.class);
        System.out.println(order);
    }
}
