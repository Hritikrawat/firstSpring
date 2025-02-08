package stereotypeannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("cus")
public class Customer {
    @Value("Ritik")
    private String name;

    @Value("Indirapuram")
    private String address;

    @Value("#{phns}")
    private List<String> pno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getPno() {
        return pno;
    }

    public void setPno(List<String> pno) {
        this.pno = pno;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", pno=" + pno +
                '}';
    }
}
