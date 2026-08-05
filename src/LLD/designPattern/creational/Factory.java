package LLD.designPattern.creational;

public class Factory {

    /**
     * The Factory Pattern provides a single place to create objects, hiding the object creation logic from the client.
     */
    public interface Payment{
        public void pay(double price);
    }

    public static class UPI implements Payment{
        @Override
        public void pay(double price) {
            System.out.println("Paying via UPI "+price);
        }
    }

    public static class Card implements Payment{
        @Override
        public void pay(double price) {
            System.out.println("Paying via Card "+price);
        }
    }

    public static class Paypal implements Payment{
        @Override
        public void pay(double price) {
            System.out.println("Paying via Paypal "+price);
        }
    }

    public static class PaymentFactory {
        public static Payment getPayments(String type) {
            return switch (type) {
                case "UPI" -> new UPI();
                case "Card" -> new Card();
                case "Paypal" -> new Paypal();
                default -> throw new IllegalArgumentException("Invalid type");
            };
        }
    }

    public static void main(String[] args) {
        Payment pay = PaymentFactory.getPayments("UPI");
        pay.pay(1.0);
    }

}
