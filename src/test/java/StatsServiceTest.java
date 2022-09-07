import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void CheckingSumsWithNegativeNumbers() {
        long[] data = {-1, -2, -4, -5, 0, 4};
        StatsService service = new StatsService();
        int expectedSum = -8;
        long actual = service.sumOfAllSales(data);

        Assertions.assertEquals(expectedSum,actual);

    }
    @Test
    public void CheckingTheAverageAmountOfSales(){
        long[] data = {0, 0, 0, 0, 0, 0};
        StatsService service = new StatsService();
        int expected = 0;
        long actual = service.middleSumSales(data);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void PeakSalesCheck(){
        long[] data = {120, 120, 120, 120, 120, 120};
        StatsService service = new StatsService();
        int expected = 6;
        long actual = service.numberMonthWithMaxSale(data);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void MinimumSalesCheck() {
        long[] data = {-1000, 2220, 120, 120, 120, 120};
        StatsService service = new StatsService();
        int expected = 1;
        long actual = service.numberMonthWithMinSale(data);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void CheckBelowAverage() {
        long[] data = {-1000, 2220, 120, 120, 120, 120};
        StatsService service = new StatsService();
        int expected = 5;
        long actual = service.numberBelowAverage(data);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void CheckAbowAverage() {
        long[] data = {-1000, 2220, 120, 120, 120, 120};
        StatsService service = new StatsService();
        int expected = 1;
        long actual = service.numberAbowAverage(data);

        Assertions.assertEquals(expected, actual);
    }
}
