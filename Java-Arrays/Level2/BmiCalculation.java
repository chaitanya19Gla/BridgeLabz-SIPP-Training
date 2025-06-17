package JavaArrays.Level2;

import java.util.Scanner;

public class BmiCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = s.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            height[i] = s.nextDouble();
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            weight[i] = s.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 24.9)
                status[i] = "Normal weight";
            else if (bmi[i] < 29.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", height[i], weight[i], bmi[i], status[i]);

    }
    }
}
