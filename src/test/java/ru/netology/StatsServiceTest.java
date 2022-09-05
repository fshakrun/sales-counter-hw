package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test

    public void MinSalesMonth (){
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MaxSalesMonth (){
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.maximalSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void AmountSalesCheck (){
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.totalAmountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void AmountOfTheSalesInMonth () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.totalSalesInMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void UnderAverageCheck (){
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsSalesUnderAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void OverAverageCheck (){
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsSalesOverAverage(sales);

        Assertions.assertEquals(expected, actual);
    }


}
