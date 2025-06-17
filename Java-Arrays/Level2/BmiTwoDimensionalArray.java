package JavaArrays.Level2;

import java.util.Scanner;

public class BmiTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n =s.nextInt();

        double[][] personData =new double[n][3]; // [height, weight, BMI]
        String[] weightStatus =new String[n];

        for (int i =0; i < n;i++) {
            do {
                System.out.print("Enter height (in meters) of person "+(i + 1)+": ");
                personData[i][0] = s.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter weight (in kg) of person "+(i + 1)+": ");
                personData[i][1] = s.nextDouble();
            } while (personData[i][1]<=0);

            personData[i][2] =personData[i][1]/(personData[i][0]*personData[i][0]);

            if (personData[i][2]<18.5)
                weightStatus[i] ="Underweight";
            else if (personData[i][2]<24.9)
                weightStatus[i]="Normal weight";
            else if (personData[i][2]<29.9)
                weightStatus[i]="Overweight";
            else
                weightStatus[i] ="Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
