package Level1;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums=new int[5];
        for(int i=0;i<5;++i)nums[i]=sc.nextInt();
        for (int num : nums) {
            if (num > 0) {
                if (num % 2 == 0) System.out.println("Number is Even");
                else System.out.println("Number is Odd");
            } else if (num < 0) System.out.println("Number is Negative");
            else System.out.println("Number is Zero");
        }
        if(nums[0]>nums[nums.length-1]) System.out.println("First number is greater than last number");
        else if(nums[0]<nums[nums.length-1]) System.out.println("First number is less than last number");
        else System.out.println("First and last number are equal");

    }
}
