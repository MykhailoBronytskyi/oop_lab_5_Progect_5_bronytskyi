package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {

    private PayPalPaymentStrategy how_to_pay= new PayPalPaymentStrategy();

    @Test
    void pay() {
        assertEquals(how_to_pay.pay(10), "You choose to pay with PayPal");
    }
}