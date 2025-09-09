import java.util.*;
import java.util.stream.*;

class Invoice {
    String transactionId;
    Invoice(String id) { this.transactionId = id; }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<String> txIds = Arrays.asList("TX100", "TX101");
        List<Invoice> invoices = txIds.stream().map(Invoice::new).collect(Collectors.toList());
    }
}