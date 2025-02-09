package SpeL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spel.xml");
        ExpressionLang el = context.getBean("el",ExpressionLang.class);
//        System.out.println(el.getVal1());
//        System.out.println(el.getVal2());
//        System.out.println(el.getZ());
        System.out.println(el);


        //System.out.println(el.getVal2().getClass().getName());

    }
}
