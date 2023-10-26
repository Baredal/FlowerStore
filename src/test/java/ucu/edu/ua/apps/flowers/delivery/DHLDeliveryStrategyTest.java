package ucu.edu.ua.apps.flowers.delivery;

import java.util.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DHLDeliveryStrategyTest {
    DHLDeliveryStrategy dhlDeliver;

    @BeforeEach
    public void init() {
        dhlDeliver = new DHLDeliveryStrategy();
    }
    
    @Test
    public void testGetDescription() {
        Assertions.assertEquals("The Items should be delivered by DHL", dhlDeliver.deliver(new LinkedList<>()));

    }
}
