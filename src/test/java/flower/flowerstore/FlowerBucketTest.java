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
        
        Flower flowerOne = new Flower();
        flowerOne.setFlowerType(FlowerType.ROSE);
        flowerOne.setPrice(price);
        FlowerPack flowerPackOne = new FlowerPack(flowerOne);
        flowerPackOne.setQuantity(quantity);
        flowerBucket.addFlowerPack(flowerPackOne);
        Assertions.assertEquals(flowerOne.getFlowerType(), FlowerType.ROSE);
        Assertions.assertEquals(priceTest, flowerBucket.getPrice());

        Flower flowerTwo = new Flower();
        flowerTwo.setFlowerType(FlowerType.CHAMOMILE);
        flowerTwo.setPrice(price);
        FlowerPack flowerPackTwo = new FlowerPack(flowerTwo);
        flowerPackTwo.setQuantity(quantity);
        flowerBucket.addFlowerPack(flowerPackTwo);
        priceTest += flowerTwo.getPrice() * quantity;
        Assertions.assertEquals(flowerTwo.getFlowerType(),
                                 FlowerType.CHAMOMILE);
        Assertions.assertEquals(priceTest, flowerBucket.getPrice());

        Flower flowerThree = new Flower();
        flowerThree.setFlowerType(FlowerType.TULIP);
        flowerThree.setPrice(price);
        FlowerPack flowerPackThree = new FlowerPack(flowerThree);
        flowerPackThree.setQuantity(quantity);
        flowerBucket.addFlowerPack(flowerPackThree);
        priceTest += flowerThree.getPrice() * quantity;
        Assertions.assertEquals(flowerThree.getFlowerType(), FlowerType.TULIP);
        Assertions.assertEquals(priceTest, flowerBucket.getPrice());
    }
}
