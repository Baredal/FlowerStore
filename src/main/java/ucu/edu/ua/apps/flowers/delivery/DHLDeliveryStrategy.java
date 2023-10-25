package ucu.edu.ua.apps.flowers.delivery;

import java.util.List;

import ucu.edu.ua.apps.flowers.flowerstore.Item;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String deliver(List<Item> items) {
        return "The Items should be delivered by DHL (to implement)";
    }
    
}
