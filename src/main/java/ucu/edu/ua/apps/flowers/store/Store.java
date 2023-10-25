package ucu.edu.ua.apps.flowers.store;

import java.util.ArrayList;
import java.util.List;
import ucu.edu.ua.apps.flowers.filters.SearchFilter;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;

public  class Store {
    private List<Flower> flowers;
    public List<Flower> search(List<SearchFilter> filters) {
        List<Flower> foundItems = new ArrayList<>();
        for (Flower flower : flowers) {
            for (SearchFilter filter : filters) {
                if (filter.match(flower)) {
                    foundItems.add(flower);
                }
            }
        }
        return foundItems;
    }
}
