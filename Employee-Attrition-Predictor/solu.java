public class EmployeeAttrition {
    public static double predictAttrition(int age, int salary, int tenure, int satisfaction) {
        double risk = 0.0;
        if (tenure < 2) risk += 0.4;
        if (satisfaction < 3) risk += 0.3;
        if (salary < 50000) risk += 0.2;
        return Math.min(risk, 1.0);
    }

    public static void main(String[] args) {
        double likelihood = predictAttrition(28, 40000, 1, 2);
        System.out.println("Attrition likelihood → " + likelihood);
    }
}
