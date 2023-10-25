package ucu.edu.ua.apps.flowers.decorators;

import ucu.edu.ua.apps.flowers.flowerstore.Item;

public abstract class ItemDecorator extends Item{
    private Item item;
    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return "This is an item decorator";
    }
}
