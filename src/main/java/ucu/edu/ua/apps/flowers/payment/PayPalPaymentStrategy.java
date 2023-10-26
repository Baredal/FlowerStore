package ucu.edu.ua.apps.flowers.payment;

public class PayPalPaymentStrategy implements Payment{
    // TODO for future cases
    // TODO implement logic for payment price
    @Override
    public String pay(double price) {
        return String.format("paying with PayPal. The price is %.2f hryvnias", price);
    }
    
}
