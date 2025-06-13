import java.util.Scanner;

public class MaxHandshake {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int students = s.nextInt();

        int handshakes = (students * (students - 1)) / 2;
        System.out.println("The maximum number of handshakes among " + students + " students is " + handshakes);

    }
}
