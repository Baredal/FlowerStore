package ucu.edu.ua.apps.flowers.payment;

public class CreditCardPaymentStrategy implements Payment{
// TODO for future cases
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
    // TODO implement logic for payment price
    @Override
    public String pay(double price) {
        return String.format("%s pays with credit card. The price is %.3f", name, price);

    }
    
}
