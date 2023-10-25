package ucu.edu.ua.apps.flowers.filters;

import lombok.AllArgsConstructor;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;

@AllArgsConstructor
public class ColorFIlter implements SearchFilter {
    private String colorCheck;


    @Override
    public boolean match(Flower flower) {
        if (flower.getColor().equals(colorCheck)) {
            return true;
        }
        return false;
    }

    

}
