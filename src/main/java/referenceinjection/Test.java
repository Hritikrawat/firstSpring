package referenceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class Test
{
    public static void main(String[] args)
    {
        ApplicationContext obj = new ClassPathXmlApplicationContext("reference.xml");
        A objA = (A)obj.getBean("aref");
        B objB = (B)obj.getBean("bref");
        System.out.println(objA);
        System.out.println(objB);
    }



}
