package flower.flowerstore;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, Integer quantity) {
        this.flower = new Flower(flower);
        this.quantity = (quantity != null) ? quantity : 1;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity < 1 ? 1 : quantity;
    }
    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
