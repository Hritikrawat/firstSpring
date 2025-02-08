package standalonecollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
    private List<String> name;
    private Map<String, Integer> marks;
    private Properties properties;

    public void setName(List<String> name) {
        this.name = name;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", marks=" + marks +
                ", properties=" + properties +
                '}';
    }
}
