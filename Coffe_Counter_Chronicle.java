import java.util.Scanner;

public class Coffe_Counter_Chronicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Order_-Your-Coffee");
        boolean input=true;
        while (input==true) {
            System.out.println("Enter quantity");
            int quantity = sc.nextInt();
            System.out.println("Select(1 ro 4) for coffe type");
            int type = sc.nextInt();
            int price = 0;
            switch (type) {
                case 1:
                    price += 100;
                    break;
                case 2:
                    price += 200;
                    break;
                case 3:
                    price += 300;
                    break;
                case 4:
                    price += 400;
                    break;
            }
            int total_bill = quantity * price;
            int gst = total_bill*6/100;
            System.out.println("Total GST -> "+gst);
            System.out.println("Your BILL");
            System.out.println(total_bill+gst);

            System.out.println("Want to continue With order (choose 1 for continue and 0 for exit)");

            int res = sc.nextInt();
            if(res == 1){
                input=true;
            } else if (res == 0) {
                input=false;
            }
        }

    }
}
