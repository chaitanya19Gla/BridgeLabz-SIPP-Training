package Level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] table = new int[10];
        for(int i=1;i<11;++i){
            table[i-1]=n*i;
        }
        for(int i=1;i<11;++i){
            System.out.println(n+"*"+i+"="+table[i-1]);
        }
    }

}
