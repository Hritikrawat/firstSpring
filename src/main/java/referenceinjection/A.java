package referenceinjection;

public class A {
    private long x;
    private B b;

    public A() {

    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }



    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", b=" + b +
                "}";
    }
}
