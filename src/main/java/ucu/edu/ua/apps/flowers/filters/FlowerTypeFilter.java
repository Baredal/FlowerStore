package ucu.edu.ua.apps.flowers.filters;

import lombok.AllArgsConstructor;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;
import ucu.edu.ua.apps.flowers.flowerstore.FlowerType;

@AllArgsConstructor
public class FlowerTypeFilter implements SearchFilter {
    public FlowerType flowerTypeCheck;

    @Override
    public boolean match(Flower flower) {
        if (flower.getFlowerType().equals(flowerTypeCheck)) {
            return true;
        }
        return false;
    }
}
