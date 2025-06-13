
import java.util.Scanner;
public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter base:");
        double base = s.nextDouble();
        System.out.println("Enter height:");
        double height = s.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;

        System.out.println("Area of triangle is " + areaInInches + " insqare or " + areaInCm + " cmsquare");
    }

}
