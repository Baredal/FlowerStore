package flower.filters;
import flower.flowerstore.Item;

public interface SearchFilter {
    boolean match(Item item);
}
