import java.util.Scanner;

public class itemAndQuantity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the unit price:");
        double unitPrice = s.nextDouble();
        System.out.println("Enter the quantity:");
        int quantity = s.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
