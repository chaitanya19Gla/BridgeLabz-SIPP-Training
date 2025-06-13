import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = s.nextDouble();
        double totalInches = heightCm / 2.54;
        int f = (int) (totalInches / 12);
        int i = (int) (totalInches % 12);
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + f + " and inches is " + i);
    }
}
