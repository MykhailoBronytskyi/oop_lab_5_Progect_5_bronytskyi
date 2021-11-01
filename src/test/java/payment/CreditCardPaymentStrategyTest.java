package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    private CreditCardPaymentStrategy how_to_pay= new CreditCardPaymentStrategy();

    @Test
    void pay() {
        assertEquals(how_to_pay.pay(10), "You choose pay with credit card");
    }
}