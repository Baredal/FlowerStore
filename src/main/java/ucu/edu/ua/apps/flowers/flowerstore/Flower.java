package ucu.edu.ua.apps.flowers.flowerstore;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @AllArgsConstructor
public class Flower extends Item{
    private FlowerType flowerType;
    private double price;
    private double sepalLength;
    private FlowerColor color;

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public String getDescription() {
        return "This is a flower";
    }

}
