package JavaArrays.Level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int n = s.nextInt();
        int temp = n;
        int digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }
        int[] reverseArray = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reverseArray[i] = n % 10;
            n /= 10;
        }
        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reverseArray[i]);
        }
        System.out.println();
    }
}
