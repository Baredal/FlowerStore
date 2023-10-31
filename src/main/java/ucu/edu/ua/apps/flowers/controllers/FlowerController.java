package ucu.edu.ua.apps.flowers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.ua.apps.flowers.flowerstore.Flower;
import ucu.edu.ua.apps.flowers.service.FlowerService;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    private  FlowerService flowerService;


    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }



    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }
}