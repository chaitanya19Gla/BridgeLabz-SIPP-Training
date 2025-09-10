
import java.time.LocalDateTime;
import java.util.*;

public class TransactionLogger {
    public static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003);

        transactionIds.forEach(id -> 
            System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}
