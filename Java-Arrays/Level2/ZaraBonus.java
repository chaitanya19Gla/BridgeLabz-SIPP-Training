package JavaArrays.Level2;

import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Program 1: Bonus calculation for 10 employees
        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];
        double[] bonuses = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double sal = s.nextDouble();
            System.out.println("Enter years of service: ");
            double yr = s.nextDouble();

            if (sal < 0 || yr < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }

            salary[i] = sal;
            years[i] = yr;
        }

        for (int i = 0; i < EMP_COUNT; i++) {
            double bonus = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            bonuses[i] = bonus;
            newSalary[i] = salary[i] + bonus;

            totalBonus += bonus;
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
