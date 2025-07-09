package vehicleRentalSystem;
import java.util.Scanner;
// ●  Custom constructors for different vehicle types
// ●  protected for vehicle attributes to allow subclass access
// ●  Rentable with method calculateRent(int days)
// ●  Used in rent calculation (e.g., baseRate × days ± surcharges)

// ○  Rentable abstracts rental behavior
// ○  Car, Bike, Truck inherit from Vehicle
// ○  Rent calculation differs by vehicle type
// ○  All fields hidden behind getters/setters.
interface Rent{
    double calculateRent(int days);
}
abstract  class vehicle implements Rent{
    protected   String model;
    protected   String make;
    protected   int year;
    protected vehicle(String model,String make,int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getMake(){
        return  make;
    }
    public void setMake(String setMake){
        this.make = make;
    }
    public int getYear(){
        return  year;
    }
    public void setYear(){
        this.year = year;
    }
}
public class vehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bike bike = new bike("Bike", "Trek", 2020, 10.0, 5.0);
        car car = new car("Sedan", "Toyota", 2021, 50.0, 20.0);
        truck truck = new truck("Pickup", "Ford", 2019, 100.0, 30.0);

        System.out.print("Enter your name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter your email: ");
        String customerEmail = sc.nextLine();

        Customer customer = new Customer(customerName, customerEmail);

        double totalRent = 0.0;
        boolean continueBooking = true;

        while (continueBooking) {
            System.out.println("\nSelect a vehicle to rent:");
            System.out.println("1. Bike");
            System.out.println("2. Car");
            System.out.println("3. Truck");
            System.out.print("Enter your choice (1-3): ");
            int choice = sc.nextInt();

            vehicle selectedVehicle = null;
            switch (choice) {
                case 1:
                    selectedVehicle = bike;
                    break;
                case 2:
                    selectedVehicle = car;
                    break;
                case 3:
                    selectedVehicle = truck;
                    break;
                default:
                    System.out.println("Invalid choice. Skipping booking.");
                    continue;
            }

            System.out.print("Enter number of days to rent: ");
            int days = sc.nextInt();

            double rent = selectedVehicle.calculateRent(days);
            totalRent += rent;

            System.out.println(customer.getName() + " rented a " + selectedVehicle.getModel() + " for " + days + " days. Rent: Rs" + rent);

            System.out.print("\nDo you want to book another vehicle? (yes/no): ");
            sc.nextLine(); 
            String response = sc.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                continueBooking = false;
            }
        }

        System.out.println("\nTotal rent amount: Rs" + totalRent);
        System.out.println("Thank you for using the Vehicle Rental System!");
    }
}
