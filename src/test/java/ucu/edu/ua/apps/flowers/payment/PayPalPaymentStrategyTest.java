package ucu.edu.ua.apps.flowers.payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PayPalPaymentStrategyTest {
    double price;
    PayPalPaymentStrategy payPal;

    @BeforeEach
    public void init() {
        price = 22;
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    public void testPay() {
        Assertions.assertEquals("paying with PayPal. The price is 22,00 hryvnias", payPal.pay(price));
    }
}
