package ucu.edu.ua.apps.flowers.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.apps.flowers.filters.ColorFilter;
import ucu.edu.ua.apps.flowers.filters.FlowerTypeFilter;
import ucu.edu.ua.apps.flowers.filters.PriceFilter;
import ucu.edu.ua.apps.flowers.filters.SearchFilter;
import ucu.edu.ua.apps.flowers.filters.SepalLenghtFilter;
import ucu.edu.ua.apps.flowers.store.Store;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;

public class StoreFiltersTest {
    private ColorFilter colorFilter;
    private PriceFilter priceFilter;
    private FlowerTypeFilter flowerTypeFilter;
    private SepalLenghtFilter sepalLenghtFilter;

    private Store store;
    private Flower flowerOne;
    private Flower flowerTwo;
    private Flower flowerThree;
    private Flower flowerFour;
    private Flower flowerFive;
    private Flower flowerSix;
    List<Flower> testList;

    @BeforeEach
    public void init() {
        testList = new ArrayList<>();

        flowerOne = new Flower();
        flowerTwo = new Flower();
        flowerThree = new Flower();
        flowerFour = new Flower();
        flowerFive = new Flower();
        flowerSix = new Flower();

        flowerOne.setFlowerType(FlowerType.CHAMOMILE);
        flowerOne.setColor(FlowerColor.WHITE);
        flowerOne.setPrice(20);
        flowerOne.setSepalLength(0.8);

        flowerTwo.setFlowerType(FlowerType.CHAMOMILE);
        flowerTwo.setColor(FlowerColor.GREEN);
        flowerTwo.setPrice(7);
        flowerTwo.setSepalLength(0.5);

        flowerThree.setFlowerType(FlowerType.TULIP);
        flowerThree.setColor(FlowerColor.RED);
        flowerThree.setPrice(8);
        flowerThree.setSepalLength(0.3);

        flowerFour.setFlowerType(FlowerType.TULIP);
        flowerFour.setColor(FlowerColor.WHITE);
        flowerFour.setPrice(20);
        flowerFour.setSepalLength(0.6);

        flowerFive.setFlowerType(FlowerType.ROSE);
        flowerFive.setColor(FlowerColor.WHITE);
        flowerFive.setPrice(20);
        flowerFive.setSepalLength(0.8);

        flowerSix.setFlowerType(FlowerType.CHAMOMILE);
        flowerSix.setColor(FlowerColor.RED);
        flowerSix.setPrice(18);
        flowerSix.setSepalLength(0.7);

        testList.add(flowerOne);
        testList.add(flowerTwo);
        testList.add(flowerThree);
        testList.add(flowerFour);
        testList.add(flowerFive);
        testList.add(flowerSix);

        store = new Store();
    }

    @Test
    public void testSearch() {
        List<SearchFilter> listFilters = new ArrayList<>();
        store.setFlowers(testList);
        Assertions.assertEquals(store.search(listFilters), testList);

        colorFilter = new ColorFilter("#FFFFFF"); // White
        priceFilter = new PriceFilter(20);
        sepalLenghtFilter = new SepalLenghtFilter(0.8);
        flowerTypeFilter = new FlowerTypeFilter(FlowerType.TULIP);

        listFilters.add(colorFilter);
        listFilters.add(priceFilter);
        
        Assertions.assertEquals(store.search(listFilters).size(), 3);

        listFilters.add(sepalLenghtFilter);

        Assertions.assertEquals(store.search(listFilters).size(), 2);

        // RED("#FF0000"), GREEN("#00FF00"), WHITE("#FFFFFF");

    }
}
