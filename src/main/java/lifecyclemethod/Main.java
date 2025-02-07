package lifecyclemethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        //constainer
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycle.xml");

        //having two classes
        LifeCycle ls = (LifeCycle) context.getBean("cls");
        LifeCycleUsingInterface usingInterface = (LifeCycleUsingInterface) context.getBean("methods");

        //printing class1 and 2 repectively
        System.out.println(ls);
        System.out.println(usingInterface);

        //registringdownHook firts class2 and then class1
        context.registerShutdownHook();  //ensuring the execution of destroy method

    }
}
