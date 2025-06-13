import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter num 1:");
        double num1 = s.nextDouble();
        System.out.println("Enter num 2:");
        double num2 = s.nextDouble();

        double add = num1 + num2;
        double subtract = num1 - num2;
        double multiply = num1 * num2;
        double divide = num2 != 0 ? num1 / num2 : Double.NaN;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + num1 + " and " + num2 + " is " + add + ", " + subtract + ", " + multiply + ", and " + divide);

    }
}
