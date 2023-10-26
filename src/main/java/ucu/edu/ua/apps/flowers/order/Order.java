package ucu.edu.ua.apps.flowers.order;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import ucu.edu.ua.apps.flowers.delivery.Delivery;
import ucu.edu.ua.apps.flowers.flowerstore.Item;
import ucu.edu.ua.apps.flowers.payment.Payment;

@Getter
public class Order {
    private List<Item> items;
    private Payment paymentStrategy;
    private Delivery deliveryStrategy;

    public Order() {
        items = new LinkedList<>();
    }

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    // TODO implement future logic here
    public String processOrder() {
        paymentStrategy.pay(calculateTotalPrice());
        deliveryStrategy.deliver(items);
        return "Your order has been processed successfully (or not)";
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

}
