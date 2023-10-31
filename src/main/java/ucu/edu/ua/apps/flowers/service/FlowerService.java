package ucu.edu.ua.apps.flowers.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ucu.edu.ua.apps.flowers.flowerstore.Flower;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerColor;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerType;

@Service
public class FlowerService {

    public List<Flower> getFlowers() {
        return List.of(new Flower(FlowerType.TULIP, 45, 0.8, FlowerColor.RED));
    }
}
