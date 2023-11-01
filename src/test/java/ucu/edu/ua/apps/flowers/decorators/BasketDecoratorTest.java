package ucu.edu.ua.apps.flowers.decorators;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.apps.flowers.flowerstore.Flower;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerColor;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerType;
import ucu.edu.ua.apps.flowers.flowerstore.Item;

import org.junit.jupiter.api.Assertions;
public class BasketDecoratorTest {

    private BasketDecorator basketDecorator;
    
    @BeforeEach
    public void init() {
        Item flower = new Flower(1, FlowerType.ROSE, 12, 0.5, FlowerColor.RED);
        basketDecorator = new BasketDecorator(flower);
    }
    
    @Test
    public void testPrice() {
        Assertions.assertEquals(16, basketDecorator.getPrice());
    }

    @Test
    public void testGetDescription() {
        Assertions.assertEquals("Additional pay costs 4 for ribbon decorator", basketDecorator.getDescription());
    }
}
