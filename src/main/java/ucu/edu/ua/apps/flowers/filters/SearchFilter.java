package ucu.edu.ua.apps.flowers.filters;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;

public interface SearchFilter {
    boolean match(Flower flower);
}
