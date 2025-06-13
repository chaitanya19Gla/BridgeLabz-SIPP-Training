import java.util.Scanner;

public class kilometerTOmiles {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = s.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
