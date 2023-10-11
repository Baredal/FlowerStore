package flower.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);

        double priceTest = price * quantity;
        
        Flower flower1 = new Flower();
        flower1.setFlowerType(FlowerType.ROSE);
        flower1.setPrice(price);
        FlowerPack flowerPack1 = new FlowerPack(flower1, quantity);
        flowerBucket.addFlowerPack(flowerPack1);
        Assertions.assertEquals(flower1.getFlowerType(), FlowerType.ROSE);
        Assertions.assertEquals(priceTest, flowerBucket.getPrice());

        Flower flower2 = new Flower();
        flower2.setFlowerType(FlowerType.CHAMOMILE);
        flower2.setPrice(price);
        FlowerPack flowerPack2 = new FlowerPack(flower2, quantity);
        flowerBucket.addFlowerPack(flowerPack2);
        priceTest += flower2.getPrice() * quantity;
        Assertions.assertEquals(flower2.getFlowerType(), FlowerType.CHAMOMILE);
        Assertions.assertEquals(priceTest, flowerBucket.getPrice());

        Flower flower3 = new Flower();
        flower3.setFlowerType(FlowerType.TULIP);
        flower3.setPrice(price);
        FlowerPack flowerPack3 = new FlowerPack(flower3, quantity);
        flowerBucket.addFlowerPack(flowerPack3);
        priceTest += flower3.getPrice() * quantity;
        Assertions.assertEquals(flower3.getFlowerType(), FlowerType.TULIP);
        Assertions.assertEquals(priceTest, flowerBucket.getPrice());
    }
}
