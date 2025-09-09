import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;
   
}

public class ProductSort {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
      

       
        products.sort((a, b) -> Double.compare(a.price, b.price));
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        products.sort((a, b) -> Double.compare(b.discount, a.discount));
    }
}