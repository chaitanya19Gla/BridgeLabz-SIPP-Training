import java.util.*; 
import java.util.stream.*; 

class Order { 
    String customer; 
    double total; 

    Order(String customer, double total) { 
        this.customer = customer; 
        this.total = total; 
    } 

    public String getCustomer() { return customer; } 
    public double getTotal() { return total; } 
} 

public class OrderRevenueSummary { 
    public static void main(String[] args) { 
        List<Order> orders = Arrays.asList( 
            new Order("Alice", 120.5), 
            new Order("Bob", 200.0), 
            new Order("Alice", 50.0), 
            new Order("Charlie", 300.0) 
        ); 

        Map<String, Double> revenue = orders.stream() 
            .collect(Collectors.groupingBy(Order::getCustomer, 
                Collectors.summingDouble(Order::getTotal))); 

        System.out.println(revenue); 
    } 
}