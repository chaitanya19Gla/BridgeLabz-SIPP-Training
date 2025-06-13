import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextFloat();
        double num2 = sc.nextFloat();
        double quotient = num1 / num2;
        double remainder = num1 % num2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + "of two number " + num1 + " and " + num2);

    }
}