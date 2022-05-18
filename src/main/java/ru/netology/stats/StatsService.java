package ru.netology.stats;

public class StatsService {
    public long theSumOfAllSales(int[] sales) {
        long sum = 0;

        for (int sale : sales) {

            sum += sale;
        }
        return sum;
    }

    public long averageSalesPerMonth(int[] sales) {
        long mean = theSumOfAllSales(sales) / sales.length;
        return mean;
    }

    public int maximumAmount(int[] sales) {
        int max = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[max]) {
                max = month;
            }
            month++;
        }
        // for (int i = 0; i < sales.length; i++) { либо такой вариант
        // if (sales[i] >= sales[max]) {
        //  max = i;
        //}
        // }
        return max + 1;
    }

    public int minAmount(int[] sales) {
        int min = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[min]) {
                min = month;
            }
            month++;
        }

        return min + 1;
    }

    public int quantityMontUnderAverage(int[] sales) {
        long avg = averageSalesPerMonth(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int quantityMontOverAverage(int[] sales) {
        long avg = averageSalesPerMonth(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}

