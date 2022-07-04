package ru.netology.stats;

public class SalesServices {
    public long sumSales(long[] price) {

        int sum = 0;
        for (long sale : price) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] price) {
        return sumSales(price) / price.length;
    }

    public long maxSales(long[] price) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : price) {

            if (sale >= price[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSales(long[] price) {
        int minMonth = 0;
        int month = 0;
        for (long sale : price) {

            if (sale <= price[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesUpAverage(long[] price) {
        long average = average(price);
        int salesUp = 0;
        for (long sale : price) {
            if (sale > average) {
                salesUp++;
            }
        }
        return salesUp;
    }

    public int salesBelowAverage(long[] price) {
        long average = average(price);
        int salesBelow = 0;
        for (long sale : price) {
            if (sale < average) {
                salesBelow++;
            }
        }
        return salesBelow;
    }
}