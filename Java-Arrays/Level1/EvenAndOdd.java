package Level1;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.err.println("Not a natural number");
            System.exit(-1);
        }
        int[] odd=new int[n/2];
        int[] even=new int[n/2];
        int o=0,e=0;
        for(int i=1;i<=n;++i){
            if((i&1)==1){
                odd[o]=i;
                ++o;
            }
            else{
                even[e]=i;
                ++e;
            }
        }
        System.out.println("Odd Numbers");
        for (int num:odd
             ) {
            System.out.println(num);
        }
        System.out.println("Even Numbers");
        for (int num:even
             ) {
            System.out.println(num);
        }
    }
}
