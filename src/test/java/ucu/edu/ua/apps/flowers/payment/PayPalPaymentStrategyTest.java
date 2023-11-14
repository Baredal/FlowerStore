package ucu.edu.ua.apps.flowers.payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PayPalPaymentStrategyTest {
    private static final int TEST_PRICE = 22;
    private PayPalPaymentStrategy payPal;


    @BeforeEach
    public void init() {
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    public void testPay() {
        Assertions.assertEquals(
        "paying with PayPal. The price is 22,00 hryvnias",
        payPal.pay(TEST_PRICE));
    }
}
