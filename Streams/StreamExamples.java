import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {

    // Movie class
    static class Movie {
        String title;
        double rating;
        int releaseYear;

        public Movie(String title, double rating, int releaseYear) {
            this.title = title;
            this.rating = rating;
            this.releaseYear = releaseYear;
        }

        public String getTitle() { return title; }
        public double getRating() { return rating; }
        public int getReleaseYear() { return releaseYear; }
    }

    // Doctor class
    static class Doctor {
        String name;
        String specialty;
        boolean availableOnWeekend;

        public Doctor(String name, String specialty, boolean availableOnWeekend) {
            this.name = name;
            this.specialty = specialty;
            this.availableOnWeekend = availableOnWeekend;
        }

        public String getSpecialty() { return specialty; }
        public boolean isAvailableOnWeekend() { return availableOnWeekend; }
    }

    // Claim class
    static class Claim {
        String type;
        double amount;

        public Claim(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public String getType() { return type; }
        public double getAmount() { return amount; }
    }

    // Member class
    static class Member {
        String name;
        LocalDate expiryDate;

        public Member(String name, LocalDate expiryDate) {
            this.name = name;
            this.expiryDate = expiryDate;
        }

        public LocalDate getExpiryDate() { return expiryDate; }
    }

    // Dummy email notification method
    static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }

    public static void main(String[] args) {
        // 1. Top 5 Trending Movies
        List<Movie> movies = Arrays.asList(
            new Movie("A", 8.5, 2023),
            new Movie("B", 9.0, 2022),
            new Movie("C", 7.8, 2024),
            new Movie("D", 8.0, 2021),
            new Movie("E", 7.5, 2025),
            new Movie("F", 8.2, 2020)
        );
        List<Movie> top5 = movies.stream()
            .filter(m -> m.getRating() >= 7.0)
            .sorted(Comparator.comparingDouble(Movie::getRating).reversed()
                .thenComparing(Movie::getReleaseYear, Comparator.reverseOrder()))
            .limit(5)
            .collect(Collectors.toList());
        System.out.println("Top 5 Trending Movies:");
        top5.forEach(m -> System.out.println(m.getTitle()));

        // 2. Hospital Doctor Availability
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Jones", "Neurology", false),
            new Doctor("Dr. Lee", "Orthopedics", true)
        );
        List<Doctor> weekendDoctors = doctors.stream()
            .filter(Doctor::isAvailableOnWeekend)
            .sorted(Comparator.comparing(Doctor::getSpecialty))
            .collect(Collectors.toList());
        System.out.println("\nDoctors available on weekends:");
        weekendDoctors.forEach(d -> System.out.println(d.name + " - " + d.specialty));

        // 3. Insurance Claim Analysis
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 5000),
            new Claim("Auto", 3000),
            new Claim("Health", 7000),
            new Claim("Auto", 2000)
        );
        Map<String, Double> avgClaimByType = claims.stream()
            .collect(Collectors.groupingBy(
                Claim::getType,
                Collectors.averagingDouble(Claim::getAmount)
            ));
        System.out.println("\nAverage claim amount by type:");
        avgClaimByType.forEach((type, avg) -> System.out.println(type + ": " + avg));

        // 4. Filtering Expiring Memberships
        List<Member> members = Arrays.asList(
            new Member("Alice", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(40)),
            new Member("Charlie", LocalDate.now().plusDays(25))
        );
        LocalDate now = LocalDate.now();
        List<Member> expiringSoon = members.stream()
            .filter(m -> ChronoUnit.DAYS.between(now, m.getExpiryDate()) <= 30)
            .collect(Collectors.toList());
        System.out.println("\nMembers expiring within 30 days:");
        expiringSoon.forEach(m -> System.out.println(m.name));

        // 5. Transforming Names for Display
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        List<String> displayNames = names.stream()
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());
        System.out.println("\nCustomer names for display:");
        displayNames.forEach(System.out::println);

        // forEach() Method Examples

        // 1. Stock Price Logger
        List<Double> stockPrices = Arrays.asList(101.5, 102.3, 99.8);
        System.out.println("\nStock Prices:");
        stockPrices.forEach(System.out::println);

        // 2. Event Attendee Welcome Message
        List<String> attendees = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("\nWelcome Messages:");
        attendees.forEach(name -> System.out.println("Welcome, " + name + "!"));

        // 3. IoT Sensor Readings
        List<Double> sensorReadings = Arrays.asList(45.0, 60.5, 30.2, 75.1);
        double threshold = 50.0;
        System.out.println("\nSensor readings above threshold:");
        sensorReadings.stream()
            .filter(r -> r > threshold)
            .forEach(System.out::println);

        // 4. Email Notifications
        List<String> emails = Arrays.asList("alice@email.com", "bob@email.com");
        System.out.println("\nSending email notifications:");
        emails.forEach(email -> sendEmailNotification(email));

        // 5. Logging Transactions
        List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002");
        System.out.println("\nLogging transactions:");
        transactionIds.forEach(id ->
            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );