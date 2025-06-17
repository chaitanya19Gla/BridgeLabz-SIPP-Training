package Level1;

import java.util.Scanner;

public class AverageHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights=new double[11];
        for(int i=0;i<11;++i)heights[i]=sc.nextDouble();
        double avgHeight=0;
        for (double height:heights
             ) {
            avgHeight+=height;
        }
        System.out.println("The average height is "+avgHeight);
    }
}
