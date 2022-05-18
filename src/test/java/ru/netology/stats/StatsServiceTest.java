package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {

        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = manager.theSumOfAllSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
        System.out.println(expected == actual);

    }

    @Test
    public void averageNumber() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.averageSalesPerMonth(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void maxAmount() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 25, 19, 20, 7, 14, 14, 18};

        long actual = manager.maximumAmount(sales);
        long expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minAmount() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 25, 19, 20, 7, 14, 14, 18};

        long actual = manager.minAmount(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsMinimumSalary() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 25, 19, 20, 7, 14, 14, 18};

        long actual = manager.quantityMontUnderAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfMonthsMaximumSalary() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.quantityMontOverAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }

}