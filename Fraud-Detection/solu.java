import java.util.*;

public class FraudDetection {
    public static void main(String[] args) {
        Map<String, Integer> transactions = new HashMap<>();
        transactions.put("T1", 10);
        transactions.put("T2", 12);
        transactions.put("T3", 5000);

        int threshold = 1000;
        for (Map.Entry<String, Integer> entry : transactions.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println("Fraudulent → " + entry.getKey());
            }
        }
    }
}
