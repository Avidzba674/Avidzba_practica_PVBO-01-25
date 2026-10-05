package ru.mirea.task6;

public class Computer implements Printable {
    private final String name;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;
    private final double price;

    public Computer(String name, Processor processor, Memory memory,
                    Monitor monitor, double price) {
        this.name = name;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public void print() {
        System.out.println("=== " + name + " ===");
        processor.print();
        memory.print();
        monitor.print();
        System.out.printf("Цена: %.2f руб.%n%n", price);
    }

    @Override
    public String toString() {
        return name + " (" + processor + "; " + memory + "; " + monitor + ") — " + price + " руб.";
    }
}