import java.util.*;

public class CICDValidator {
    public static void main(String[] args) {
        Map<String, Object> pipeline = new HashMap<>();
        pipeline.put("jobs", "build");
        pipeline.put("steps", Arrays.asList("echo Hello"));

        if (pipeline.containsKey("jobs") && pipeline.containsKey("steps")) {
            System.out.println("Valid config");
        } else {
            System.out.println("Invalid config: Missing jobs/steps");
        }
    }
}
