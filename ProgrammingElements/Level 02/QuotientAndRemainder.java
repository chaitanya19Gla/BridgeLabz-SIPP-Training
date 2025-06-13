import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1=sc.nextFloat();
        float num2=sc.nextFloat();
        float quotient=num1/num2;
        float remainder=num1%num2;
        System.out.println("The Quotient is "+ quotient+" and Reminder is " +remainder +"of two number "+ num1+" and "+num2);
    }
}
