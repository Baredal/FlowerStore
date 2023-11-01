package ucu.edu.ua.apps.flowers.decorators;

import ucu.edu.ua.apps.flowers.flowerstore.Item;

public class PaperDecorator extends AbstractDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }
    
    @Override
    public double getPrice() {
        return 13 + super.getPrice();
    }

    public String getDescription() {
        return "Addition pay costs 13 for paper decorator";
    }
}
