package ru.mirea.task4.Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> items = new ArrayList<>();

    public void add(Product p) {
        items.add(p);
        System.out.println("Добавлено в корзину: " + p.getName());
    }

    public boolean isEmpty() { return items.isEmpty(); }

    public double getTotal() {
        double sum = 0;
        for (Product p : items) sum += p.getPrice();
        return sum;
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста — нечего покупать.");
            return;
        }
        System.out.println("\n=== Чек ===");
        for (Product p : items) System.out.println(p);
        System.out.printf("Итого: %.2f руб.%n", getTotal());
        System.out.println("Покупка совершена. Спасибо!");
        items.clear();
    }
}