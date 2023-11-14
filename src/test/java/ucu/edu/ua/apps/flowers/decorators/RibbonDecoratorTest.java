package ucu.edu.ua.apps.flowers.decorators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.apps.flowers.flowerstore.Flower;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerColor;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerType;
import ucu.edu.ua.apps.flowers.flowerstore.Item;


public class RibbonDecoratorTest {
    private int testPrice = 55;
    private double testSepalLength = 0.9;
    private int totalPrice = 95;
    private RibbonDecorator ribbonDecorator;

    @BeforeEach
    public void init() {
        Item flower = new Flower(1, FlowerType.TULIP,
         testPrice, testSepalLength, FlowerColor.GREEN);
        ribbonDecorator = new RibbonDecorator(flower);
    }
    
    @Test
    public void testPrice() {
        Assertions.assertEquals(totalPrice, ribbonDecorator.getPrice());
    }

    @Test
    public void testGetDescription() {
        Assertions.assertEquals(
        "Additional pay costs 40 for ribbon decorator",
         ribbonDecorator.getDescription());
    }
}

