import java.lang.reflect.*;
import java.util.*;

class Employee {
    private String name;
    private int salary;

    public String getName() { return name; }
    public int getSalary() { return salary; }
}

public class CustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            try {
                Field f = clazz.getDeclaredField(entry.getKey());
                f.setAccessible(true);
                f.set(obj, entry.getValue());
            } catch (NoSuchFieldException e) {
                // ignore
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Alice");
        data.put("salary", 50000);

        Employee emp = toObject(Employee.class, data);
        System.out.println("Employee: " + emp.getName() + ", Salary: " + emp.getSalary());
    }
}