package ucu.edu.ua.apps.flowers.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ucu.edu.ua.apps.flowers.filters.SearchFilter;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;


@Setter @Getter
public class Store {
    private List<Flower> flowers;
    public List<Flower> search(List<SearchFilter> filters) {
        List<Flower> foundItems = new ArrayList<>();

        for (Flower flower : flowers) {
            boolean matchesAllFilters = true;

            for (SearchFilter filter : filters) {
                if (!filter.match(flower)) {
                    matchesAllFilters = false;
                    break;
                }
            }

            if (matchesAllFilters || filters.isEmpty()) {
                foundItems.add(flower);
            }
        }

        return foundItems;
    }


}

