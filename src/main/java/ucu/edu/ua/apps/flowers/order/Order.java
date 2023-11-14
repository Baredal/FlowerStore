package ucu.edu.ua.apps.flowers.order;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ucu.edu.ua.apps.flowers.delivery.Delivery;
import ucu.edu.ua.apps.flowers.flowerstore.Item;
import ucu.edu.ua.apps.flowers.payment.Payment;


public class Order {
    private List<Item> items;
    @Getter @Setter
    private Payment paymentStrategy;
    @Getter @Setter
    private Delivery deliveryStrategy;

    public Order() {
        items = new LinkedList<>();
    }

    public int getSize() {
        return items.size();
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    // TODO implement future logic here
    public String processOrder() {
        paymentStrategy.pay(calculateTotalPrice());
        deliveryStrategy.deliver(items);
        return "Your order has been processed successfully (or not) with " 
                + items.toString() 
                + " " 
                + getPaymentStrategy().getClass().getSimpleName() 
                + " " 
                + getDeliveryStrategy().getClass().getSimpleName();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

}
