import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.SalesServices;
package ru.netology.stats;
public class SalesServicesTest {
    @Test
    public void sumTest() {
        SalesServices services = new SalesServices();
        int[] price = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = services.sumSales(price);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageTest() {
        SalesServices services = new SalesServices();
        int[] price = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = services.sumSales(price) / price.length;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxSalesMonth(){
SalesServices services = new SalesServices();
        int[] price = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : price) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= price[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }

    }
    }

