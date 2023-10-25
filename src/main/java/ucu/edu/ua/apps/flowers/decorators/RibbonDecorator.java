package ucu.edu.ua.apps.flowers.decorators;

import ucu.edu.ua.apps.flowers.flowerstore.Item;

public class RibbonDecorator extends ItemDecorator{

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return "Additional pay costs 4 for ribbon decorator";
    }
    
}
