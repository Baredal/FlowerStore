package ucu.edu.ua.apps.flowers.filters;

import lombok.AllArgsConstructor;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;

@AllArgsConstructor
public class SepalLenghtFilter implements SearchFilter {
    private double sepalLengthCheck;


    @Override
    public boolean match(Flower flower) {
        if (flower.getSepalLength() == sepalLengthCheck) {
            return true;
        }
        return false;
    }
}
