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

    private int testPriceOne = 20;
    private double testSepalLengthOne = 0.8;
    private int testPriceTwo = 7;
    private double testSepalLengthTwo = 0.6;

    private int totalQuantityOne = 3;
    private int totalQuantityTwo = 4;



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
        flowerOne.setPrice(testPriceOne);
        flowerOne.setSepalLength(testSepalLengthOne);

        flowerTwo.setFlowerType(FlowerType.CHAMOMILE);
        flowerTwo.setColor(FlowerColor.GREEN);
        flowerTwo.setPrice(testPriceTwo);
        flowerTwo.setSepalLength(0.5);

        flowerThree.setFlowerType(FlowerType.TULIP);
        flowerThree.setColor(FlowerColor.RED);
        flowerThree.setPrice(testPriceOne);
        flowerThree.setSepalLength(testSepalLengthOne);

        flowerFour.setFlowerType(FlowerType.TULIP);
        flowerFour.setColor(FlowerColor.WHITE);
        flowerFour.setPrice(testPriceOne);
        flowerFour.setSepalLength(testSepalLengthTwo);

        flowerFive.setFlowerType(FlowerType.ROSE);
        flowerFive.setColor(FlowerColor.WHITE);
        flowerFive.setPrice(testPriceOne);
        flowerFive.setSepalLength(testSepalLengthOne);

        flowerSix.setFlowerType(FlowerType.CHAMOMILE);
        flowerSix.setColor(FlowerColor.RED);
        flowerSix.setPrice(testPriceOne);
        flowerSix.setSepalLength(testSepalLengthOne);

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
        priceFilter = new PriceFilter(testPriceOne);
        sepalLenghtFilter = new SepalLenghtFilter(testSepalLengthOne);
        flowerTypeFilter = new FlowerTypeFilter(FlowerType.TULIP);

        listFilters.add(colorFilter);
        listFilters.add(priceFilter);
        
        Assertions.assertEquals(store.search(listFilters).size(), totalQuantityOne);

        listFilters.add(sepalLenghtFilter);

        Assertions.assertEquals(store.search(listFilters).size(), 2);

        ColorFilter colorFilterTwo = new ColorFilter("#FF0000"); // REd

        listFilters.add(colorFilterTwo);

        Assertions.assertEquals(store.search(listFilters).size(), totalQuantityTwo);

        listFilters.add(flowerTypeFilter);

        Assertions.assertEquals(store.search(listFilters).size(), 1);


        // RED("#FF0000"), GREEN("#00FF00"), WHITE("#FFFFFF");

    }
}
