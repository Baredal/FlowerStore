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
    private int testPrice = 20;
    private double testSepalLength = 0.7;
    private int totalPrice = 33;
    
    @BeforeEach
    public void init() {
        Item flower = new Flower(1, FlowerType.CHAMOMILE,
         testPrice, testSepalLength, FlowerColor.WHITE);
        paperDecorator = new PaperDecorator(flower);
    }
    
    @Test
    public void testPrice() {
        Assertions.assertEquals(totalPrice, paperDecorator.getPrice());
    }

    @Test
    public void testGetDescription() {
        Assertions.assertEquals(
        "Addition pay costs 13 for paper decorator",
         paperDecorator.getDescription());
    }
}
