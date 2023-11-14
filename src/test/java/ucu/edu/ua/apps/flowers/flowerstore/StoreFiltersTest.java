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
    private FlowerTypeFilter flowerTypeFilter;
    private PriceFilter priceFilter;
    private SepalLenghtFilter sepalLenghtFilter;
    private ColorFilter colorFilter;

    private Store store;
    private Flower flowerOne;
    private Flower flowerTwo;
    private Flower flowerThree;
    private Flower flowerFour;
    private Flower flowerFive;
    private Flower flowerSix;
    private List<Flower> testList;

    private static final int TEST_PRICE_ONE = 20;
    private static final double TEST_SEPAL_LENGTH_ONE = 0.8;
    private static final int TEST_PRICE_TWO = 7;
    private static final double TEST_SEPAL_LENGTH_TWO = 0.6;

    private static final int TOTAL_QUANTITY_ONE = 3;
    private static final int TOTAL_QUANTITY_TWO = 4;



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
        flowerOne.setPrice(TEST_PRICE_ONE);
        flowerOne.setSepalLength(TEST_SEPAL_LENGTH_ONE);

        flowerTwo.setFlowerType(FlowerType.CHAMOMILE);
        flowerTwo.setColor(FlowerColor.GREEN);
        flowerTwo.setPrice(TEST_PRICE_TWO);
        flowerTwo.setSepalLength(0.5);

        flowerThree.setFlowerType(FlowerType.TULIP);
        flowerThree.setColor(FlowerColor.RED);
        flowerThree.setPrice(TEST_PRICE_ONE);
        flowerThree.setSepalLength(TEST_SEPAL_LENGTH_ONE);

        flowerFour.setFlowerType(FlowerType.TULIP);
        flowerFour.setColor(FlowerColor.WHITE);
        flowerFour.setPrice(TEST_PRICE_ONE);
        flowerFour.setSepalLength(TEST_SEPAL_LENGTH_TWO);

        flowerFive.setFlowerType(FlowerType.ROSE);
        flowerFive.setColor(FlowerColor.WHITE);
        flowerFive.setPrice(TEST_PRICE_ONE);
        flowerFive.setSepalLength(TEST_SEPAL_LENGTH_ONE);

        flowerSix.setFlowerType(FlowerType.CHAMOMILE);
        flowerSix.setColor(FlowerColor.RED);
        flowerSix.setPrice(TEST_PRICE_ONE);
        flowerSix.setSepalLength(TEST_SEPAL_LENGTH_ONE);

        testList.add(flowerOne);
        testList.add(flowerTwo);
        testList.add(flowerThree);
        testList.add(flowerFour);
        testList.add(flowerFive);
        testList.add(flowerSix);

        store = new Store();
    }
    // check all aplied filters and returns flowers 
    // that matches for them (can be different filters parametres of same type)
    @Test
    public void testSearch() {
        List<SearchFilter> listFilters = new ArrayList<>();
        store.setFlowers(testList);
        Assertions.assertEquals(store.search(listFilters), testList);

        colorFilter = new ColorFilter("#FFFFFF"); // White
        priceFilter = new PriceFilter(TEST_PRICE_ONE);
        sepalLenghtFilter = new SepalLenghtFilter(TEST_SEPAL_LENGTH_ONE);
        flowerTypeFilter = new FlowerTypeFilter(FlowerType.TULIP);

        listFilters.add(colorFilter);
        listFilters.add(priceFilter);
        
        Assertions.assertEquals(store.search(listFilters).size(),
        TOTAL_QUANTITY_ONE);

        listFilters.add(sepalLenghtFilter);

        Assertions.assertEquals(store.search(listFilters).size(), 2);

        ColorFilter colorFilterTwo = new ColorFilter("#FF0000"); // REd

        listFilters.add(colorFilterTwo);

        Assertions.assertEquals(store.search(listFilters).size(),
        TOTAL_QUANTITY_TWO);

        listFilters.add(flowerTypeFilter);

        Assertions.assertEquals(store.search(listFilters).size(), 1);


        // RED("#FF0000"), GREEN("#00FF00"), WHITE("#FFFFFF");

    }
}
