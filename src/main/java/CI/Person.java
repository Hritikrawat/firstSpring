package CI;

public class Person {
    private String name;
    private long id;
    private Certi cer;

    public Person(String name , long id)
    {
        System.out.println("String and Long");
        this.name = name;
        this.id = id;
    }

    public Person (String name, String id)
    {
        System.out.println("String and String");
        this.name=name;
        this.id=Long.parseLong(id);
    }

    public Person (long id,String name,Certi cer)
    {
        System.out.println("String,long,cer");
        this.name=name;
        this.id=id;
        this.cer=cer;
    }

    @Override
    public String toString() {
        return "Person{ Name ='" +
                name+"' , id ='"+id+"' , Cerfiticate ='"+cer+"}";
    }
}
