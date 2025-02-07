package lifecyclemethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleUsingInterface implements InitializingBean, DisposableBean {
    private long price;
    public void setPrice(long price)
    {
        System.out.println("Setting price");
        this.price = price;

    }

    @Override
    public String toString() {
        return "LifeCycleUsingInterface{" +
                "price=" + price +
                '}';
    }

    //woks as init method (name is different but we know name can be altered)
    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("I have Bought Pespsi for :"+price);
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("I have Drunk my pepsi , now i m going");
    }
}
