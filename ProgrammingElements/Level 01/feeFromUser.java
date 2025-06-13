import java.awt.*;
import java.util.Scanner;

public class feeFromUser {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter student fee: ");
        double userFee = s.nextDouble();
        System.out.print("Enter discount percentage: ");
        double userDisPercent = s.nextDouble();
        double userDis = (userDisPercent / 100) * userFee;
        double finalFee = userFee - userDis;
        System.out.println("The discount amount is INR " + userDis + " and final discounted fee is INR " + finalFee);
    }
}
