package ucu.edu.ua.apps.flowers.payment;

public class CreditCardPaymentStrategy implements Payment{
// TODO for future cases

    // TODO implement logic for payment price
    @Override
    public String pay(double price) {
        return String.format("paying with credit card. The price is %.2f hryvnias", price);

    }
    
}
