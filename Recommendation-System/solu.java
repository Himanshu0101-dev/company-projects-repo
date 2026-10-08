import java.util.*;

public class RecommendationSystem {
    public static void main(String[] args) {
        Map<String, List<String>> userPurchases = new HashMap<>();
        userPurchases.put("UserA", Arrays.asList("Shoes", "Watch"));
        userPurchases.put("UserB", Arrays.asList("Shoes", "Bag"));
        userPurchases.put("UserC", Arrays.asList("Watch"));

        String targetUser = "UserC";
        Set<String> recommendations = new HashSet<>();

        for (Map.Entry<String, List<String>> entry : userPurchases.entrySet()) {
            if (!entry.getKey().equals(targetUser)) {
                for (String item : entry.getValue()) {
                    if (!userPurchases.get(targetUser).contains(item)) {
                        recommendations.add(item);
                    }
                }
            }
        }

        System.out.println("Recommendations for " + targetUser + ": " + recommendations);
    }
}
