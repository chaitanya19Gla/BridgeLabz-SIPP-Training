import java.util.*; 
import java.util.stream.*; 

class Employee { 
    String name; 
    String department; 
    double salary; 

    Employee(String name, String department, double salary) { 
        this.name = name; 
        this.department = department; 
        this.salary = salary; 
    } 

    public String getDepartment() { return department; } 
    public double getSalary() { return salary; } 
} 

public class EmployeeSalaryCategorization { 
    public static void main(String[] args) { 
        List<Employee> employees = Arrays.asList( 
            new Employee("John", "HR", 50000), 
            new Employee("Jane", "HR", 60000), 
            new Employee("Tom", "IT", 70000), 
            new Employee("Lucy", "IT", 80000), 
            new Employee("Mark", "Finance", 75000) 
        ); 

        Map<String, Double> avgSalaryByDept = employees.stream() 
            .collect(Collectors.groupingBy(Employee::getDepartment, 
                Collectors.averagingDouble(Employee::getSalary))); 

        System.out.println(avgSalaryByDept); 
    } 
}