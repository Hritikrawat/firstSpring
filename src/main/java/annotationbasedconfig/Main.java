package annotationbasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfiguratingClass.class);
//      Sample samp = context.getBean("sample1", Sample.class); // @Component
        Sample sample = context.getBean("getSample",Sample.class);
        System.out.println(sample);

    }
}
