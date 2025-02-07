package CI;

public class Additon {
    private int a;
    private int b;

    public Additon(double a , double b)
    {
        System.out.println("Double Double");
        this.a=(int)a;
        this.b=(int)b;
    }
    public Additon(int a , int b)
    {
        System.out.println("Int Int");
        this.a=a;
        this.b=b;
    }
    public Additon(String a , String b)
    {
        System.out.println("STRING");
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
    }

    @Override
    public String toString() {
        return "Additon{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
