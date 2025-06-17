package Level1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String[] arr=new String[num];
        for(int i=0;i<num;++i){
            if(i%3==0 && i%5==0) arr[i]="FizzBuzz";
            else if(i%3==0) arr[i]="Fizz";
            else if(i%5==0) arr[i]="Buzz";
            else arr[i]=String.valueOf(i);
        }
        for (String s:arr
             ) {
            System.out.println(s);
        }
    }
}
