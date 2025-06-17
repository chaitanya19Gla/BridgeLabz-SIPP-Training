package JavaArrays.Level2;

import java.util.Scanner;

public class StudentGradesTwoD {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = s.nextInt();

        double[][] marks =new double[n][3]; // [Physics, Chemistry, Maths]
        double[] percentage =new double[n];
        String[] grade= new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student "+(i + 1));

            for (int j = 0; j < 3; j++) {
                String subject= (j == 0) ? "Physics":(j == 1)?"Chemistry" : "Maths";
                do {
                    System.out.print(subject + ": ");
                    marks[i][j]= s.nextDouble();
                } while (marks[i][j]< 0 || marks[i][j]>100);
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i]>=80)
                grade[i]= "A";
            else if(percentage[i]>=70)
                grade[i]= "B";
            else if(percentage[i]>=60)
                grade[i]= "C";
            else if(percentage[i]>=50)
                grade[i]= "D";
            else if(percentage[i]>= 40)
                grade[i]= "E";
            else
                grade[i]= "F";
        }

        System.out.println("\nPhysics\tChemistry\tMaths\t%\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t\t%.2f\t%.2f\t%s\n", marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}
