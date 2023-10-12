package flower.flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter
public class FlowerPack {
    @Setter
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        setQuantity(1);
    }

    public void setQuantity(int newQuantity) {
        if (newQuantity < 1) {
            this.quantity = 1;
        }
        else {
            this.quantity = newQuantity;
        }
    }
    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
