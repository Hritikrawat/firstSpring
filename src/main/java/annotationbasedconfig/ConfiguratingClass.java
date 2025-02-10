package annotationbasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "annotationbasedconfig")  //we dont need to use this annotion while using @Bean as it doesnt need @Component
public class ConfiguratingClass                         // which this annotion scans for.
{

    @Bean
    public Product getProduct()
    {
        return new Product();
    }

    @Bean
    public Sample getSample()
    {
        Sample sam = new Sample();
        sam.setVal(10);
        sam.setProduct(getProduct());
        return sam;
    }


}
