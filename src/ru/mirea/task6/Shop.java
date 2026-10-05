package ru.mirea.task6;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Printable {
    private final String shopName;
    private final List<Computer> computers = new ArrayList<>();

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public void addComputer(Computer c) {
        computers.add(c);
    }

    public void removeComputer(String name) {
        computers.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    public Computer findCheapest() {
        return computers.stream()
                .min((a, b) -> Double.compare(a.getPrice(), b.getPrice()))
                .orElse(null);
    }

    public Computer findMostExpensive() {
        return computers.stream()
                .max((a, b) -> Double.compare(a.getPrice(), b.getPrice()))
                .orElse(null);
    }

    @Override
    public void print() {
        System.out.println("Магазин: " + shopName);
        System.out.println("Компьютеров в наличии: " + computers.size());
        for (Computer c : computers) {
            c.print();
        }
    }
}