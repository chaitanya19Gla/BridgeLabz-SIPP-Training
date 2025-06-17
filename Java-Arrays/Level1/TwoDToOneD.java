package Level1;

import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        int[] array=new int[row*col];
        int idx=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[idx]=matrix[i][j];
                ++idx;
            }
        }
    }
}
