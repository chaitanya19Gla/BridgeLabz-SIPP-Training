
import java.time.*;
import java.util.*;
import java.util.stream.*;

class Member {
    String name;
    LocalDate expiryDate;
    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
    public String toString() {
        return name + " - Expiry: " + expiryDate;
    }
}

public class ExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Alice", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(40)),
            new Member("Charlie", LocalDate.now().plusDays(20))
        );

        LocalDate today = LocalDate.now();
        LocalDate cutoff = today.plusDays(30);

        members.stream()
               .filter(m -> !m.expiryDate.isAfter(cutoff))
               .forEach(System.out::println);
    }
}
