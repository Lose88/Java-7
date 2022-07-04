package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.SalesServices;


public class SalesServicesTest {
    @Test
    public void sumTest() {
        SalesServices services = new SalesServices();
        long[] price = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = services.sumSales(price);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageTest() {

        long[] price = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        SalesServices services = new SalesServices();
        long expected = 15;
        long actual = services.average(price);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        long[] price = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        SalesServices services = new SalesServices();
        int expected = 8;
        long actual = services.maxSales(price);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        long[] price = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        SalesServices services = new SalesServices();
        int expected = 9;
        long actual = services.minSales(price);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesUpAverage() {
        long[] price = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        SalesServices services = new SalesServices();
        int expected = 5;
        long actual = services.salesUpAverage(price);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesBelowAverage() {
        long[] price = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        SalesServices services = new SalesServices();
        int expected = 5;
        long actual = services.salesBelowAverage(price);
        Assertions.assertEquals(expected, actual);
    }
}


