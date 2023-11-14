package ucu.edu.ua.apps.flowers.decorators;

import ucu.edu.ua.apps.flowers.flowerstore.Item;

public class RibbonDecorator extends AbstractDecorator {
    private int additionalPrice = 40;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return additionalPrice + super.getPrice();
    }

    @Override
    public String getDescription() {
        return "Additional pay costs 40 for ribbon decorator";
    }
    
}
