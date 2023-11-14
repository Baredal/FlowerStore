package ucu.edu.ua.apps.flowers.decorators;

import ucu.edu.ua.apps.flowers.flowerstore.Item;

public class PaperDecorator extends AbstractDecorator {
    private static final int ADDITIONAL_PRICE = 13;
    
    public PaperDecorator(Item item) {
        super(item);
    }
    
    @Override
    public double getPrice() {
        return ADDITIONAL_PRICE + super.getPrice();
    }

    public String getDescription() {
        return "Addition pay costs 13 for paper decorator";
    }
}
