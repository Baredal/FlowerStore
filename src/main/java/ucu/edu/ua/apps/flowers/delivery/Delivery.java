package ucu.edu.ua.apps.flowers.delivery;

import java.util.List;

import ucu.edu.ua.apps.flowers.flowerstore.Item;

public interface Delivery {
    String deliver(List<Item> items);
}
