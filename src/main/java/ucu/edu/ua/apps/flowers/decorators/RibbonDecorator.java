package ucu.edu.ua.apps.flowers.decorators;

import ucu.edu.ua.apps.flowers.flowerstore.Item;

public class RibbonDecorator extends AbstractDecorator {
    private static final int ADDITIONAL_PRICE = 40;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return ADDITIONAL_PRICE + super.getPrice();
    }

    @Override
    public String getDescription() {
        return "Additional pay costs 40 for ribbon decorator";
    }
    
}
