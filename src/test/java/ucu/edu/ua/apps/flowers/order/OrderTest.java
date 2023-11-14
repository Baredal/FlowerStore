package ucu.edu.ua.apps.flowers.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.apps.flowers.decorators.RibbonDecorator;
import ucu.edu.ua.apps.flowers.delivery.DHLDeliveryStrategy;
import ucu.edu.ua.apps.flowers.delivery.PostDeliveryStrategy;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerBucket;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerColor;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerPack;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerType;
import ucu.edu.ua.apps.flowers.flowerstore.Item;
import ucu.edu.ua.apps.flowers.payment.CreditCardPaymentStrategy;
import ucu.edu.ua.apps.flowers.payment.PayPalPaymentStrategy;

public class OrderTest {
    private static final int TEST_PRICE_ONE = 20;
    private static final int TEST_TOTAL_PRICE = 100;
    private static final int TEST_QUANTITY = 3;
    private Item flowerBucket;
    private Item flowerOne;
    private Item flowerPack;
    private Order order;


    @BeforeEach
    public void init() {
        order = new Order();
        flowerOne = new Flower(1, FlowerType.CHAMOMILE,
        TEST_PRICE_ONE, 0.5, FlowerColor.WHITE);
        flowerPack = new FlowerPack((Flower) flowerOne);
        ((FlowerPack) flowerPack).setQuantity(TEST_QUANTITY);
        flowerBucket = new FlowerBucket();
        ((FlowerBucket) flowerBucket).addFlowerPack((FlowerPack) flowerPack);
        flowerBucket = new RibbonDecorator(flowerBucket);
        order = new Order();
        order.addItem(flowerBucket);
    }

    @Test
    public void testCalculateTotalPrice() {
        Assertions.assertEquals(TEST_TOTAL_PRICE, order.calculateTotalPrice());
    }

    @Test
    public void testSetPaymentPayPal() {
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        Assertions.assertInstanceOf(PayPalPaymentStrategy.class,
        order.getPaymentStrategy());
    }

    @Test
    public void testSetPaymentCreditCard() {
        order.setPaymentStrategy(new CreditCardPaymentStrategy());
        Assertions.assertInstanceOf(CreditCardPaymentStrategy.class,
        order.getPaymentStrategy());
    }

    @Test
    public void testSetDeliveryPost() {
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        Assertions.assertInstanceOf(PostDeliveryStrategy.class,
        order.getDeliveryStrategy());
    }

    @Test
    public void testSetDeliveryDhl() {
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        Assertions.assertInstanceOf(DHLDeliveryStrategy.class,
        order.getDeliveryStrategy());
    }


    @Test
    public void testAddItem() {
        Assertions.assertEquals(order.getSize(), 1);
        Item newFlowerBucket = new FlowerBucket();
        order.addItem(newFlowerBucket);
        Assertions.assertEquals(order.getSize(), 2);
        
    }

    @Test
    public void testRemoveItem() {
        Assertions.assertEquals(order.getSize(), 1);
        order.removeItem(flowerBucket);
        Assertions.assertEquals(order.getSize(), 0);

    }

    @Test
    public void testGetSize() {
        Assertions.assertEquals(order.getSize(), 1);
    }
}
