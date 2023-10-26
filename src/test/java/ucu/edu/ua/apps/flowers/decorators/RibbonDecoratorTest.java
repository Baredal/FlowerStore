package ucu.edu.ua.apps.flowers.decorators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.apps.flowers.flowerstore.Flower;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerColor;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerType;
import ucu.edu.ua.apps.flowers.flowerstore.Item;


public class RibbonDecoratorTest {
    
    private RibbonDecorator ribbonDecorator;
    
    @BeforeEach
    public void init() {
        Item flower = new Flower(FlowerType.TULIP, 55, 0.9, FlowerColor.GREEN);
        ribbonDecorator = new RibbonDecorator(flower);
    }
    
    @Test
    public void testPrice() {
        Assertions.assertEquals(95, ribbonDecorator.getPrice());
    }

    @Test
    public void testGetDescription() {
        Assertions.assertEquals("Additional pay costs 40 for ribbon decorator", ribbonDecorator.getDescription());
    }
}

