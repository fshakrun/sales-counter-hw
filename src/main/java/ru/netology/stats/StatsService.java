package ru.netology.stats;


public class StatsService {

    // минимальные продажи
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


// максимальные продажи
    public int maximalSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; 
        for (long sale : sales) {
            
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; 
        }
        return maxMonth + 1;
    }

    public int totalAmountSales(long[] sales) {
        int sum = 0;
        for (int i =0; i < sales.length; i++){
            sum += sales[i];
        }
        return sum;

    }

    public int totalSalesInMonth(long[] sales) {
        return totalAmountSales(sales) / 12;
    }

    public int monthsSalesUnderAverage(long [] sales){
        int sum = 0;
        long under = totalSalesInMonth(sales);
        for (long sale: sales) {
            if (sale < under){
                sum ++;
            }
        }
        return sum;
    }

    public int monthsSalesOverAverage(long [] sales){
        int sum = 0;
        long under = totalSalesInMonth(sales);
        for (long sale:sales) {
            if (sale > under) {
                sum++;
            }
        }
        return sum;
    }
}
