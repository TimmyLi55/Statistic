public class Main {
    public static void main(String[] args) {
        long data[] = {
            10, 2, 10, 4, 4, 3, 5, 30, 30, 1, 12, 31
        };
        StatsService service = new StatsService();
        System.out.println(service.sumOfAllSales(data));
        System.out.println(service.middleSumSales(data));
        System.out.println(service.numberMonthWithMaxSale(data));
        System.out.println(service.numberMonthWithMinSale(data));
        System.out.println(service.numberBelowAverage(data));
        System.out.println(service.numberAbowAverage(data));
    }
}
