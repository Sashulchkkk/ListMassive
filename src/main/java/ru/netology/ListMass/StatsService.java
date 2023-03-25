package ru.netology.ListMass;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long sumValue(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averAmount(long[] sales, long sum) {
        long sumAmount = sum / sales.length;
        return sumAmount;
    }

    public int belowAverage(long[] sales, long averAmount) {
        int numMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averAmount) {
                numMonth++;
            }
        }
        return numMonth;
    }

    public int aboveAverage(long[] sales, long averAmount) {
        int numMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averAmount) {
                numMonth++;
            }
        }
        return numMonth;
    }
}
