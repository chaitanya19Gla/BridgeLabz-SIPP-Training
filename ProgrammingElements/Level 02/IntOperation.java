import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum1=a+b*c;
        int sum2=a*b+c;
        int sum3=c+a/b;
        int sum4=a%b+c;
        System.out.println("The results of Int Operations are "+sum1+", "+sum2+", "+sum2+", and "+sum4);
    }
}
