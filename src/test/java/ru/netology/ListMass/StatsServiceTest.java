package ru.netology.ListMass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();

    @Test
    public void minSalesTest() {
        int expected = 9;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSales() {
        int expected = 8;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sumValue() {
        long expected = 180;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumValue(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void averAmount() {
        long expected = 15;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averAmount(sales, service.sumValue(sales));
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void belowAverage() {
        long expected = 5;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.belowAverage(sales, service.averAmount(sales, service.sumValue(sales)));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverage() {
        long expected = 7;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.aboveAverage(sales, service.averAmount(sales, service.sumValue(sales)));
        Assertions.assertEquals(expected, actual);
    }


}
