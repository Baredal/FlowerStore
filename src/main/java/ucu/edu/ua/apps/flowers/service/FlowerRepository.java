package ucu.edu.ua.apps.flowers.service;

import org.springframework.data.jpa.repository.JpaRepository;

import ucu.edu.ua.apps.flowers.flowerstore.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    
}
