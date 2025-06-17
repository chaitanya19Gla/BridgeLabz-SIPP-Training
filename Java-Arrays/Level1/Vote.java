package Level1;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<10;++i)age[i]=sc.nextInt();
        for(int i=0;i<10;++i){
            if(age[i]<0){
                System.err.println("Invalid Age");
                System.exit(-1);
            }
            if(age[i]>=18){
                System.out.println("The student with the age "+age[i]+" can vote");
            }
            else {
                System.out.println("The student with the age "+age[i]+" cannot vote");
            }
        }
    }
}
