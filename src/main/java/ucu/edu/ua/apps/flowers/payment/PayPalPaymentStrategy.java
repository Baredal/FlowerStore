package ucu.edu.ua.apps.flowers.payment;

public class PayPalPaymentStrategy implements Payment {
    // TODO for future cases
    // TODO implement logic for payment price
    @Override
    public String pay(double price) {
        return "paying with PayPal. The price is " 
        + String.format("%.2f", price) 
        + " hryvnias";

    }
    
}
