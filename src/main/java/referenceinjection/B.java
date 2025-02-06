package referenceinjection;

public class B {
    private long Y;

    public B() {
    }

    @Override
    public String toString() {
        return "B{" +
                "Y=" + Y +
                '}';
    }

    public long getY() {
        return Y;
    }

    public void setY(long y) {
        Y = y;
    }
}
