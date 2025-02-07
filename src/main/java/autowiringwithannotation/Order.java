package autowiringwithannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Order {

    private String id;

    @Autowired
    @Qualifier("orderDetails2")
    private OrderDetails orderDetails;

    public Order() {
    }


    public Order(OrderDetails orderDetails) {
        System.out.println("Autowired annotation using constructor");
        this.orderDetails = orderDetails;
    }

    public void setId(String id) {
        this.id = id;
    }

    //  @Autowired
    public void setOrderDetails(OrderDetails orderDetails) {
        System.out.println("Autowired annotation using setter");
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order = [" + id + " , " + orderDetails + "]";
    }


}
