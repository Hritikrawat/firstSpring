package CI;

public class Certi {
private String program;

    public Certi(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "{" +
                "program='" + program + '\'' +
                '}';
    }
}
