package autowiring;

public class OrderDetails
{
    private String item;
    private String price;
    private String date;



    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "OrderDetails = ["+item+" , "+price+" , Order Date :"+date+" ]";
    }
}
