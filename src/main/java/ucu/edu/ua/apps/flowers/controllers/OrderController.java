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

    @GetMapping("/processing")
    public String proccesOrder() {
        Flower flowerOne = new Flower(FlowerType.CHAMOMILE, 20, 0.5, FlowerColor.WHITE);
        Flower flowerTwo = new Flower(FlowerType.TULIP, 25, 0.5, FlowerColor.RED);
        Order order = new Order();
        FlowerPack flowerPackOne = new FlowerPack(flowerOne);
        flowerPackOne.setQuantity(2);
        FlowerPack flowerPackTwo = new FlowerPack(flowerTwo);
        flowerPackTwo.setQuantity(3);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPackOne);
        flowerBucket.addFlowerPack(flowerPackTwo);
        order.addItem(flowerBucket);
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        return order.processOrder();

    }
    
}
