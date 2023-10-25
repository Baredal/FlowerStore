package ucu.edu.ua.apps.flowers.payment;

public class PayPalPaymentStrategy implements Payment{
    // TODO for future cases
    private String email;
    private String password;
    

    public PayPalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // TODO implement logic for payment price
    @Override
    public String pay(double price) {
        return String.format("%s pays with PayPal. The price is %.3f", email, price);
    }
    
}
