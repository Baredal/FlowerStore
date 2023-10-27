package ucu.edu.ua.apps.flowers.flowerstore;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter @NoArgsConstructor @ToString
public class FlowerPack extends Item {

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

    @Override
    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    @Override
    public String getDescription() {
        return "This is a banch of flowers (pack)";
    }

    
}
