public class StatsService {
    public long sumOfAllSales(long[] data) {
        long sumOffAll = 0;
        for (int i = 0; i < data.length; i++) {
            sumOffAll = sumOffAll + data[i];
        }
        return sumOffAll;
    }

    public long middleSumSales(long[] data) {
        long middleSum = sumOfAllSales(data) / data.length;
        return middleSum;
    }

    public int numberMonthWithMaxSale(long[] data) {
        int maxSale = 0;
        int month = 0;
        for (long sale : data) {
            if (sale >= data[maxSale]) {
                maxSale = month;
            }
            month++;
        }
        return maxSale + 1;
    }

    public int numberMonthWithMinSale(long[] data) {
        int minSale = 0;
        int month = 0;
        for (long sale : data) {
            if (sale <= data[minSale]) {
                minSale = month;
            }
            month++;
        }
        return minSale + 1;
    }

    public int numberBelowAverage(long[] data) {
        int num = 0;
        for (long sale : data) {
            if (sale < middleSumSales(data)) {
                num++;
            }
        }
        return num;
    }

    public int numberAbowAverage(long[] data) {
        int num = 0;
        for (long sale : data) {
            if (sale > middleSumSales(data)) {
                num++;
            }
        }
        return num;
    }
}
