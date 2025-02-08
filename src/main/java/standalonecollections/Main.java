package standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone.xml");
        Student s= context.getBean("student1",Student.class);
        Student s2= context.getBean("student1",Student.class);
        System.out.println(s);
        System.out.println(s2);
    }
}
