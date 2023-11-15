package ucu.edu.ua.apps.flowers.flowerserive;

import org.springframework.data.jpa.repository.JpaRepository;

import ucu.edu.ua.apps.flowers.flowerstore.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    
}
