package flower.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flower = new Flower();
        flowerPack = new FlowerPack(flower, 5);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }


    @Test
    public void testColor1() {
        FlowerColor color = FlowerColor.GREEN;
        flower.setColor(color);
        Assertions.assertEquals("#00FF00", flower.getColor());
    }

    @Test
    public void testColor2() {
        FlowerColor color = FlowerColor.WHITE;
        flower.setColor(color);
        Assertions.assertEquals("#FFFFFF", flower.getColor());
    }

    @Test
    public void testFlowerPack() {
        Assertions.assertEquals(5, flowerPack.getQuantity());
        Assertions.assertTrue(flowerPack.getFlower() instanceof Flower);
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        flower.setPrice(price);
        flowerPack = new FlowerPack(flower, quantity);
        double test_price = quantity * flower.getPrice();
        Assertions.assertEquals(test_price, flowerPack.getPrice());

    }
}
