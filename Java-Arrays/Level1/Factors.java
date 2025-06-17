package Level1;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] factors=new int[num/2];
        int idx=0;
        for(int i=1;i<=num/2;++i){
            if(num%i==0){
                factors[idx]=i;
                ++idx;
            }
        }
        System.out.println("Factors of "+num);
        for (int n:factors
             ) {
            if (n!=0) System.out.println(n);
        }
    }
}
