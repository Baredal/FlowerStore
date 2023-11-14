package ucu.edu.ua.apps.flowers.store;

import java.util.ArrayList;
import java.util.List;


import lombok.Getter;
import lombok.Setter;
import ucu.edu.ua.apps.flowers.filters.ColorFilter;
import ucu.edu.ua.apps.flowers.filters.FlowerTypeFilter;
import ucu.edu.ua.apps.flowers.filters.PriceFilter;
import ucu.edu.ua.apps.flowers.filters.SearchFilter;
import ucu.edu.ua.apps.flowers.filters.SepalLenghtFilter;
import ucu.edu.ua.apps.flowers.flowerstore.Flower;



public class Store {
    @Setter @Getter
    private List<Flower> flowers;
    
    public List<Flower> search(List<SearchFilter> filters) {
        List<Flower> foundItems = new ArrayList<>();
        if (filters.isEmpty()) {
            for (Flower flower : flowers) {
                foundItems.add(flower);
            }
            return foundItems;
        }



        for (Flower flower : flowers) {
            Boolean colorMatch = null;
            Boolean sepalLenghtMatch = null;
            Boolean priceMatch = null;
            Boolean flowerTypeMatch = null;
        
            for (SearchFilter filter : filters) {
                if (filter instanceof ColorFilter) {
                    colorMatch = false;
                } 
                else if (filter instanceof SepalLenghtFilter) {
                    sepalLenghtMatch = false;
                } 
                else if (filter instanceof PriceFilter) {
                    priceMatch = false;
                } 
                else if (filter instanceof FlowerTypeFilter) {
                    flowerTypeMatch = false;
                } 
            }
        
            for (SearchFilter filter : filters) {
                if (filter instanceof ColorFilter && filter.match(flower)) {
                    colorMatch = true;
                } else if (filter instanceof SepalLenghtFilter 
                            && filter.match(flower)) {
                    sepalLenghtMatch = true;
                } else if (filter instanceof PriceFilter 
                            && filter.match(flower)) {
                    priceMatch = true;
                } else if (filter instanceof FlowerTypeFilter
                             && filter.match(flower)) {
                    flowerTypeMatch = true;
                }
            }
            
            if ((colorMatch == null || colorMatch)
                && (sepalLenghtMatch == null || sepalLenghtMatch)
                && (priceMatch == null || priceMatch) &&
              (flowerTypeMatch == null || flowerTypeMatch)) {
                foundItems.add(flower);
            }
        }
        return foundItems;

    }
}

