package lifecyclemethod;

public class LifeCycle {

    private long life;

    public LifeCycle(long life) {
        System.out.println("Setting life");

        this.life = life;
    }
    public void init()
    {
        System.out.println("This is init method");
    }
    @Override
    public String toString() {
        return "{" +
                "Age = " + life +
                '}';
    }
    public void destroy()
    {
        System.out.println("This is destroy method");
    }

}
