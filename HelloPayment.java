public class HelloPayment {

    public static String processPayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount must be positive"
            );
        }
        return "Payment of Rs." + amount + " processed!";
    }

    public static void main(String[] args) {
        System.out.println(processPayment(1000.0));
        System.out.println(processPayment(500.0));
         // New feature added
        System.out.println("Payment service is running successfully!");


    }
}
