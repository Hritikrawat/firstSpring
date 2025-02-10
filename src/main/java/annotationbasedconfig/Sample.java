package annotationbasedconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("sample1")      //here component is class level, and telling spring to create , manage this automatically
                            //while we can use @Bean to configure a bean this is a method level annotation provides more control.
public class Sample {       // creation and configuration of a bean

    public Sample() {
    }

//    @Value("10")
    private int val;
    private Product product;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void test()
    {
        System.out.println("Testing");
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Sample = { " +
                "val=" + val +
                ", product=" + product.productIs() +
                '}';
    }
}
