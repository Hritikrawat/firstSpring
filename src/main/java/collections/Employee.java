package collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String empName;
    private Set<String> phone;
    private List<String> address;
    private Map<String , String> details;




    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public Set<String> getPhone() {
        return phone;
    }

    public void setPhone(Set<String> phone) {
        this.phone = phone;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }


}
