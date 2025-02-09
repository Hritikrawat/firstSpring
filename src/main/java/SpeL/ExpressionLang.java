package SpeL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("el")
public class ExpressionLang {
    @Value("#{22+10}")
    private  int val1;

    @Value("#{7>9}")
    private  boolean bool;

    @Value("#{false?'Yes':'No'}")
    private String val2;

    @Value("#{T(java.lang.Math).pow(5,2)}")                     //calling static method using SpeL
    private double Z;

    @Value("#{new java.lang.String('Ritik')}")                 //create object and insert using Spel and Value
    private String name;

    public double getZ() {
        return Z;
    }

    public void setZ(double z) {
        Z = z;
    }

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExpressionLang = [" +
                "val1=" + val1 +
                ", bool=" + bool +
                ", val2='" + val2 + '\'' +
                ", Z=" + Z +
                ", name='" + name + '\'' +
                ']';
    }
}
