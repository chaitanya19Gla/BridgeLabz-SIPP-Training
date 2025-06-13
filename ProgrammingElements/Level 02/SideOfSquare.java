import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter perimeter:");
        double perimeter = s.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
