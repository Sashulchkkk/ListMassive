package ru.netology.ListMass;

public class Main {
    public static void main(String[] args) {
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long sum = service.sumValue(sales);
        int minMonth = service.minSales(sales);
        int maxMonth = service.maxSales(sales);
        long averAmount = service.averAmount(sales, sum);
        long belowAverage = service.belowAverage(sales, averAmount);
        long aboveAverage = service.aboveAverage(sales, averAmount);
        System.out.println("Сумма за все месяцы " + sum);
        System.out.println("Номер месяца с минимальными продажами " + minMonth);
        System.out.println("Номер месяца с максимальными продажами " + maxMonth);
        System.out.println("Средняя сумма продаж в месяц " + averAmount);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + belowAverage);
        System.out.println("Количество месяцев, в которых продажи были выше среднего " + aboveAverage);
    }
}