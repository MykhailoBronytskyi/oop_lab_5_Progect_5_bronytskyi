package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuckyStrategyTest {

    private LuckyStrategy how_to_pay = new LuckyStrategy();

    @Test
    void pay() {
        assertEquals(how_to_pay.pay(10), "Yoo-hoo!!! You are the winner and can buy your thing for free!!!");
    }
}
