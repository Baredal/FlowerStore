package ucu.edu.ua.apps.flowers.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ucu.edu.ua.apps.flowers.flowerstore.Flower;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }
}
