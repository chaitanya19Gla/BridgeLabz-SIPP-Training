public class AmbulanceService implements TransportService, EmergencyService {
    private String name;
    private double fare;
    private String schedule;

    public AmbulanceService(String name, double fare, String schedule) {
        this.name = name;
        this.fare = fare;
        this.schedule = schedule;
    }

    public String getName() { return name; }
    public double getFare() { return fare; }
    public String getSchedule() { return schedule; }
}