package ru.kurkin.task3;

public class Main {
    public static void main(String[] args) {
        double totalQuantity = 0;
        double totalSum = 0;

        // Пример детализации
        String[][] detail = {
                {"Иванов", "30,88848888"},
                {"Петров", "5,88848888"},
                {"Сидоров", "5,88848888"},
                {"Малевин", "5,88848888"},
                {"Макаров", "5,88848888"},
                {"Сетченко", "1,88848888"},
                {"Козлов", "1,88848888"}
        };

        for (int i = 0; i < detail.length; i++) {
            String name = detail[i][0];
            double quantity = Double.parseDouble(detail[i][1].replace(",", "."));

            double roundedQuantity = Math.round(quantity * 10) / 10.0;
            double distribution = Math.round((roundedQuantity - quantity) * 100) / 100.0;
            double sum = roundedQuantity;

            totalQuantity += quantity;
            totalSum += sum;

            System.out.println("Фамилия: " + name);
            System.out.println("Количество(кг): " + quantity);
            System.out.println("Округленное Количество*Цену: " + sum);
            System.out.println("Распределение копеек: " + distribution);
            System.out.println("Сумма: " + sum);
            System.out.println();
        }

        System.out.println("Итого");
        System.out.println("Количество(кг): " + totalQuantity);
        System.out.println("Сумма: " + totalSum);
    }
}


