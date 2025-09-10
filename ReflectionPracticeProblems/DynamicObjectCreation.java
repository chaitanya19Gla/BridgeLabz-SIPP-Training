import java.lang.reflect.*;

class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public String getName() { return name; }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Student");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Student s = (Student) obj;
        System.out.println("Created Student: " + s.getName());
    }
}