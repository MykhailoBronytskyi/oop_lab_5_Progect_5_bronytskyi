package payment;

public class PayPalPaymentStrategy implements Payment{

    @Override
    public String pay(double price) {
        System.out.println("You choose to pay with PayPal");
        return "You choose to pay with PayPal";
    }
}
