package ucu.edu.ua.apps.flowers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.ua.apps.flowers.payment.CreditCardPaymentStrategy;
import ucu.edu.ua.apps.flowers.payment.PayPalPaymentStrategy;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @GetMapping("/paypal")
    public String payPayPal(@RequestParam double price) {
        PayPalPaymentStrategy payPal = new PayPalPaymentStrategy();
        return payPal.pay(price);

    }

    @GetMapping("/creditcard")
    public String creditCard(@RequestParam double price) {
        CreditCardPaymentStrategy creditCard = new CreditCardPaymentStrategy();
        return creditCard.pay(price);

    }
}
