package ucu.edu.ua.apps.flowers.delivery;



import java.util.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PostDeliveryStrategyTest {
    private PostDeliveryStrategy postDelivery;

    @BeforeEach
    public void init() {
        postDelivery = new PostDeliveryStrategy();
    }
    
    @Test
    public void testGetDescription() {
        Assertions.assertEquals(
        "The Items should be delivered by post",
         postDelivery.deliver(new LinkedList<>()));

    }
}
