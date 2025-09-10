import java.util.*;
import java.util.stream.*;

public class MainApp {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService("City Bus", 20, "9:00 AM"),
            new MetroService("Metro Line 1", 15, "9:15 AM"),
            new TaxiService("City Taxi", 50, "Available"),
            new AmbulanceService("Ambulance", 0, "24/7")
        );

        // 1. Lambda Expressions - Filter & Sort
        System.out.println("Filtered by fare <= 20 and sorted:");
        services.stream()
            .filter(s -> s.getFare() <= 20)
            .sorted((s1, s2) -> Double.compare(s1.getFare(), s2.getFare()))
            .forEach(TransportService::printServiceDetails);

        // 2. Method References
        System.out.println("\nAll Services:");
        services.forEach(TransportService::printServiceDetails);

        // 3. Static Method in Interface (GeoUtils)
        double distance = GeoUtils.calculateDistance(0, 0, 3, 4);
        System.out.println("\nCalculated Distance: " + distance);

        // 4. Functional Interface with Lambda
        FareCalculator calculator = (dist, baseFare) -> dist * baseFare;
        System.out.println("Fare for 10km taxi: " + calculator.calculateFare(10, 5));

        // 5. Passengers & Stream API + Collectors
        List<Passenger> passengers = Arrays.asList(
            new Passenger("Alice", "Route1", 20, true),
            new Passenger("Bob", "Route1", 25, false),
            new Passenger("Charlie", "Route2", 15, true),
            new Passenger("David", "Route2", 30, true),
            new Passenger("Eva", "Route3", 50, false)
        );

        // groupingBy
        Map<String, List<Passenger>> byRoute = passengers.stream()
            .collect(Collectors.groupingBy(Passenger::getRoute));
        System.out.println("\nPassengers Grouped by Route: " + byRoute);

        // partitioningBy
        Map<Boolean, List<Passenger>> byPeak = passengers.stream()
            .collect(Collectors.partitioningBy(Passenger::isPeakTime));
        System.out.println("Passengers by PeakTime: " + byPeak);

        // summarizingDouble
        DoubleSummaryStatistics fareStats = passengers.stream()
            .collect(Collectors.summarizingDouble(Passenger::getFarePaid));
        System.out.println("Fare Summary: " + fareStats);

        // Detecting Emergency Services (Marker Interface)
        System.out.println("\nEmergency Services:");
        services.stream()
            .filter(s -> s instanceof EmergencyService)
            .forEach(TransportService::printServiceDetails);
    }
}