package ru.mirea.task3.Format1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    // Курсы условные (за 1 единицу валюты -> RUB)
    private static final double USD_TO_RUB = 95.50;
    private static final double EUR_TO_RUB = 103.20;
    private static final double CNY_TO_RUB = 13.40;

    public static double convert(double amount, String from, String to) {
        double inRub = switch (from.toUpperCase()) {
            case "USD" -> amount * USD_TO_RUB;
            case "EUR" -> amount * EUR_TO_RUB;
            case "CNY" -> amount * CNY_TO_RUB;
            case "RUB" -> amount;
            default -> throw new IllegalArgumentException("Неизвестная валюта: " + from);
        };

        return switch (to.toUpperCase()) {
            case "USD" -> inRub / USD_TO_RUB;
            case "EUR" -> inRub / EUR_TO_RUB;
            case "CNY" -> inRub / CNY_TO_RUB;
            case "RUB" -> inRub;
            default -> throw new IllegalArgumentException("Неизвестная валюта: " + to);
        };
    }

    public static String format(double amount, Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Из валюты (RUB/USD/EUR/CNY): ");
        String from = sc.nextLine().trim();

        System.out.print("В валюту (RUB/USD/EUR/CNY): ");
        String to = sc.nextLine().trim();

        double result = convert(amount, from, to);

        // Форматирование в разных локалях
        System.out.println("\nРезультат:");
        System.out.printf("Без форматирования:      %.4f%n", result);
        System.out.println("Локаль по умолчанию:     " + format(result, Locale.getDefault()));
        System.out.println("Локаль США (USD):        " + format(result, Locale.US));
        System.out.println("Локаль Франции (EUR):    " + format(result, Locale.FRANCE));
        System.out.println("Локаль Китая (CNY):      " + format(result, Locale.CHINA));
        System.out.println("Локаль России (RUB):     " + format(result, new Locale("ru", "RU")));

        // Пример форматирования по маске через printf
        System.out.printf("%nСпецификаторы printf:%n");
        System.out.printf("  %-15s: %,15.2f%n", "Сумма", result);
        System.out.printf("  %-15s: %,+15.2f%n", "Со знаком", result);
        System.out.printf("  %-15s: %,.3f%n",    "Точность 3", result);

        sc.close();
    }
}