package ucu.edu.ua.apps.flowers.flowerstore;


import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter @NoArgsConstructor @ToString
public class FlowerBucket extends Item{
    private List<FlowerPack> flowerPacks = new ArrayList<>();


    @Override
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        return "This is a bucket of flowers";
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

}
