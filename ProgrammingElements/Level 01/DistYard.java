import java.util.Scanner;

public class DistYard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the distance in feet:");
        double distanceFeet = s.nextDouble();
        double yards = distanceFeet / 3;
        double miles = yards / 1760;
        System.out.println("The distance is " + yards + " yards and " + miles + " miles");

    }
}
