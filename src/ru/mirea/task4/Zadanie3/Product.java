package ru.mirea.task4.Zadanie3;

public class Product {
    private final String name;
    private final Category category;
    private final double price;

    public Product(String name, Category category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() { return name; }
    public Category getCategory() { return category; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("%-20s | %-12s | %8.2f руб.",
                name, category.getTitle(), price);
    }
}