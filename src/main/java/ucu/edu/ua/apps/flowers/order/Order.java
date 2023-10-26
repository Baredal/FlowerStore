package ucu.edu.ua.apps.flowers.order;

import java.util.LinkedList;
import java.util.List;

import java.util.Iterator;

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
        double totalPrice = 0;
        Iterator<Item> cur = items.iterator();
        while (cur.hasNext()) {
            Item item = cur.next();
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    // TODO implement future logic here
    public String processOrder() {
        double totalPrice = this.calculateTotalPrice();
        paymentStrategy.pay(totalPrice);
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
