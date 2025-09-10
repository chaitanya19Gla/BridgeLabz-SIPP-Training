public class TaxiService implements TransportService {
    private String name;
    private double fare;
    private String schedule;

    public TaxiService(String name, double fare, String schedule) {
        this.name = name;
        this.fare = fare;
        this.schedule = schedule;
    }

    public String getName() { return name; }
    public double getFare() { return fare; }
    public String getSchedule() { return schedule; }
}