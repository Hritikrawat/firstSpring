package CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext obj = new ClassPathXmlApplicationContext("ciconfigure.xml");
        Person p = (Person)obj.getBean("person");
        System.out.println(p);
    }
}
