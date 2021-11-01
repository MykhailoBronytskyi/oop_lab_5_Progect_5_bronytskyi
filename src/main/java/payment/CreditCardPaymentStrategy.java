package payment;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public String pay(double price) {
        System.out.println("You choose pay with credit card");
        return "You choose pay with credit card";
    }
}
