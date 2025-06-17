package Level1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        double sum=0;
        for(int i=0;i<10;++i){
            double n = sc.nextDouble();
            if(n<=0)break;
            else nums[i]=n;
        }
        for(double n:nums) sum+=n;
        System.out.println("Sum of numbers is "+sum);
    }
}
