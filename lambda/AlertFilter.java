import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String type;
    // constructor, getters omitted
}

public class AlertFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
           // new Alert("Critical"), new Alert("Info"), new Alert("Warning")
        );

        Predicate<Alert> showCritical = a -> "Critical".equals(a.type);
        List<Alert> filtered = alerts.stream().filter(showCritical).collect(Collectors.toList());
        filtered.forEach(a -> System.out.println(a.type));
    }
}