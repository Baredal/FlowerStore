package ucu.edu.ua.apps.flowers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.ua.apps.flowers.delivery.DHLDeliveryStrategy;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerBucket;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerColor;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerPack;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerType;
import ucu.edu.ua.apps.flowers.order.Order;
import ucu.edu.ua.apps.flowers.payment.PayPalPaymentStrategy;

// test contoller to see what happens on website

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private static final int PRICE_ONE = 20;
    private static final int PRICE_TWO = 25;
    private static final int QUANTITY_ONE = 2;
    private static final int QUANTITY_TWO = 3;

    @GetMapping("/processing")
    public String proccesOrder() {
        Flower flowerOne = new Flower(1, FlowerType.CHAMOMILE, 
            PRICE_ONE, 0.5, FlowerColor.WHITE);
        Flower flowerTwo = new Flower(1, FlowerType.TULIP,
             PRICE_TWO, 0.5, FlowerColor.RED);
        Order order = new Order();
        FlowerPack flowerPackOne = new FlowerPack(flowerOne);
        flowerPackOne.setQuantity(QUANTITY_ONE);
        FlowerPack flowerPackTwo = new FlowerPack(flowerTwo);
        flowerPackTwo.setQuantity(QUANTITY_TWO);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPackOne);
        flowerBucket.addFlowerPack(flowerPackTwo);
        order.addItem(flowerBucket);
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        return order.processOrder();

    }
    
}
