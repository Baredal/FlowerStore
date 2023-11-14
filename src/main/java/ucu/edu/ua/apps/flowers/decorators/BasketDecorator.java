package ucu.edu.ua.apps.flowers.decorators;

import ucu.edu.ua.apps.flowers.flowerstore.Item;

public class BasketDecorator extends AbstractDecorator {
    private int additionalPrice = 4;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return additionalPrice + super.getPrice();
    }

    @Override
    public String getDescription() {
        return "Additional pay costs 4 for ribbon decorator";
    }
    
}
