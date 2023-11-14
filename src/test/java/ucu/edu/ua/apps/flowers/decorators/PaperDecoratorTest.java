package ucu.edu.ua.apps.flowers.decorators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.apps.flowers.flowerstore.Flower;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerColor;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerType;
import ucu.edu.ua.apps.flowers.flowerstore.Item;

public class PaperDecoratorTest {
    private PaperDecorator paperDecorator;
    private static final int TEST_PRICE = 20;
    private static final double TEST_SEPAL_LENGTH = 0.7;
    private static final int TOTAL_PRICE = 33;
    
    @BeforeEach
    public void init() {
        Item flower = new Flower(1, FlowerType.CHAMOMILE,
         TEST_PRICE, TEST_SEPAL_LENGTH, FlowerColor.WHITE);
        paperDecorator = new PaperDecorator(flower);
    }
    
    @Test
    public void testPrice() {
        Assertions.assertEquals(TOTAL_PRICE, paperDecorator.getPrice());
    }

    @Test
    public void testGetDescription() {
        Assertions.assertEquals(
        "Addition pay costs 13 for paper decorator",
         paperDecorator.getDescription());
    }
}
