package ucu.edu.ua.apps.flowers.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.ua.apps.flowers.delivery.DHLDeliveryStrategy;
import ucu.edu.ua.apps.flowers.delivery.PostDeliveryStrategy;
import ucu.edu.ua.apps.flowers.flowerstore.Item;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    @GetMapping("/post")
    public String deliverPost(@RequestParam List<Item> items) {
        PostDeliveryStrategy postDeliver = new PostDeliveryStrategy();
        return postDeliver.deliver(items);
    }
    @GetMapping("/dhl")
    public String deliverDHL(@RequestParam List<Item> items) {
        
        DHLDeliveryStrategy dhlDeliver = new DHLDeliveryStrategy();
        return dhlDeliver.deliver(items);
    }
    
}