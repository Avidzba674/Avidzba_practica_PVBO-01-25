package ru.mirea.task7.Zadanie8;

public class Journal implements Printable {
    private final String name;

    public Journal(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public void print() {
        System.out.printf("Журнал '%s'%n", name);
    }
}