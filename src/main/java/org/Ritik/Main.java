package org.Ritik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
        Student st = (Student) context.getBean("student1") ;
        Student st2 = (Student) context.getBean("student2") ;
        Student st3 = (Student) context.getBean("student3") ;
        System.out.println(st+" \n"+st2+" \n"+st3);

    }
}