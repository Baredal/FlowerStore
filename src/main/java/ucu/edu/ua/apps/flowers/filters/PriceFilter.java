package ucu.edu.ua.apps.flowers.filters;

import lombok.AllArgsConstructor;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;

@AllArgsConstructor
public class PriceFilter implements SearchFilter {
    private double priceCheck;
    
    public boolean match(Flower flower) {
        if (flower.getPrice() == priceCheck) {
            return true;
        }
        return false;
    }
}
