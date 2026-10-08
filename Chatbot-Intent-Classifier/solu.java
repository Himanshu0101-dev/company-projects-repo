public class ChatbotClassifier {
    public static String classify(String query) {
        query = query.toLowerCase();
        if (query.contains("order")) return "Order Status";
        if (query.contains("refund")) return "Refund";
        if (query.contains("product")) return "Product Info";
        return "Unknown Intent";
    }

    public static void main(String[] args) {
        String input = "Where is my order?";
        System.out.println("Intent → " + classify(input));
    }
}
