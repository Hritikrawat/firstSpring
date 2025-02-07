package autowiring;

public class Order {

    private String id;
    private OrderDetails orderDetails;

    public Order() {
    }

    public Order(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order = ["+id+" , "+orderDetails+"]";
    }


}
