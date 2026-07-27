package LLD.designPattern.behavioral;


public class Strategy {


    /**
     * The Strategy Design Pattern is a Behavioral Design Pattern that allows you to define a family of algorithms,
     * encapsulate each one in a separate class, and make them interchangeable at runtime.
     * Example : Google Maps Navigation
     * Sorting Algorithms
     * Discount Calculation
     *
     * Strategy INTERFACE
     */
    public interface PaymentStrategy {
        void pay(double amount);
    }

    // Concrete Strategies - UPI Payment
    public static class UPIPayment implements PaymentStrategy {
        @Override
        public void pay(double amount) {
            System.out.println("Paying " + amount + " via UPI.");
        }
    }

    // Card Payment
    public static class CardPayment implements PaymentStrategy {
        @Override
        public void pay(double amount) {
            System.out.println("Paying " + amount + " via CreditCard.");
        }
    }

    // Pay pal Payment
    public static class Paypal implements PaymentStrategy {
        @Override
        public void pay(double amount) {
            System.out.println("Paying " + amount + " via Paypal.");
        }
    }

    // Context Class
    public static class PaymentService {
        protected PaymentStrategy paymentStrategy;

        public PaymentService(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void payment(double amount) {
            paymentStrategy.pay(amount);
        }
    }


    // Client
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new UPIPayment());

        paymentService.payment(123.45);

        paymentService = new PaymentService(new CardPayment());
        paymentService.payment(123.45);

        paymentService = new PaymentService(new Paypal());
        paymentService.payment(123.45);
    }

}
