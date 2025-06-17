package JavaArrays.Level2;

import java.util.*;

public class YoungestFriend {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friends[i] + ": ");
            ages[i] = s.nextInt();
            System.out.println("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = s.nextDouble();
        }

        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        System.out.println("Youngest: " + friends[youngestIndex]);
        System.out.println("Tallest: " + friends[tallestIndex]);
    }
}
