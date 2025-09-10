public interface TransportService {
    String getName();
    double getFare();
    String getSchedule();

    default void printServiceDetails() {
        System.out.println("Service: " + getName() + ", Fare: " + getFare() + ", Schedule: " + getSchedule());
    }
}