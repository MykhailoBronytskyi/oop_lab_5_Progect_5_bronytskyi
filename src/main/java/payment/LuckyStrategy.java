package payment;

public class LuckyStrategy implements Payment {
    @Override
    public String pay(double price) {
        System.out.println("Yoo-hoo!!! You are the winner and can buy your thing for free!!!");
        return "Yoo-hoo!!! You are the winner and can buy your thing for free!!!";
    }
}