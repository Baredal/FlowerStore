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
    private int defaultQuantity = 1;

    @BeforeEach
    public void init() {
        flower = new Flower();
        flowerPack = new FlowerPack(flower, defaultQuantity);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColorRed() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }


    @Test
    public void testColorGreen() {
        FlowerColor color = FlowerColor.GREEN;
        flower.setColor(color);
        Assertions.assertEquals("#00FF00", flower.getColor());
    }

    @Test
    public void testColorWhite() {
        FlowerColor color = FlowerColor.WHITE;
        flower.setColor(color);
        Assertions.assertEquals("#FFFFFF", flower.getColor());
    }

    @Test
    public void testFlowerPack() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);

        Assertions.assertEquals(defaultQuantity, flowerPack.getQuantity());
        Assertions.assertTrue(flowerPack.getFlower() instanceof Flower);
        double priceTest = quantity * flower.getPrice();
        Assertions.assertEquals(priceTest, flowerPack.getPrice());


        flower.setPrice(price);
        flowerPack = new FlowerPack(flower, quantity);
        priceTest = quantity * flower.getPrice();
        Assertions.assertEquals(priceTest, flowerPack.getPrice());

    }
}
