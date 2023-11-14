package ucu.edu.ua.apps.flowers.payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy creditCard;
    private int testPrice = 15;

    @BeforeEach
    public void init() {
        creditCard = new CreditCardPaymentStrategy();
    }

    @Test
    public void testPay() {
        Assertions.assertEquals(
        "paying with credit card. The price is 15,00 hryvnias",
         creditCard.pay(testPrice));
    }
}
