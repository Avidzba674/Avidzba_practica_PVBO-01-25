package ru.mirea.task7.Zadanie8;

public class Book implements Printable {
    private final String name;
    private final String author;
    private final int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() { return name; }

    @Override
    public void print() {
        System.out.printf("Книга '%s' (автор %s) издана в %d году%n",
                name, author, year);
    }

    // Статический метод: печатает названия только книг
    public static void printBooks(Printable[] printable) {
        System.out.println("=== Только книги ===");
        for (Printable p : printable) {
            if (p instanceof Book) {
                System.out.println("Название: " + ((Book) p).getName());
            }
        }
    }
}