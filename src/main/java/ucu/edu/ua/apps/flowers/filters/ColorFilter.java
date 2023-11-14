package ucu.edu.ua.apps.flowers.filters;

import lombok.AllArgsConstructor;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;

@AllArgsConstructor
public class ColorFilter implements SearchFilter {
    private String colorCheck;


    @Override
    public boolean match(Flower flower) {
        return flower.getColor().equals(colorCheck);

    }
}
