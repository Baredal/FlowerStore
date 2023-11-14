package ucu.edu.ua.apps.flowers.decorators;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.apps.flowers.flowerstore.Flower;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerColor;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerType;
import ucu.edu.ua.apps.flowers.flowerstore.Item;

import org.junit.jupiter.api.Assertions;
public class BasketDecoratorTest {
    private static final int TEST_PRICE = 12;
    private static final int TEST_TOTAL_PRICE = 16;
    private BasketDecorator basketDecorator;
    
    @BeforeEach
    public void init() {
        Item flower = new Flower(1, FlowerType.ROSE, 
        TEST_PRICE, 0.5, FlowerColor.RED);
        basketDecorator = new BasketDecorator(flower);
    }
    
    @Test
    public void testPrice() {
        Assertions.assertEquals(TEST_TOTAL_PRICE, basketDecorator.getPrice());
    }

    @Test
    public void testGetDescription() {
        Assertions.assertEquals(
            "Additional pay costs 4 for ribbon decorator",
             basketDecorator.getDescription());
    }
}
