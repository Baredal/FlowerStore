package ucu.edu.ua.apps.flowers.payment;

public class CreditCardPaymentStrategy implements Payment {
// TODO for future cases

    // TODO implement logic for payment price
    @Override
    public String pay(double price) {
        return "paying with credit card. The price is " 
        + String.format("%.2f", price) 
        + " hryvnias";

    }
    
}
