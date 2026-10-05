package ru.mirea.task2.Zadanie7;

public class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();

        shelf.addBook(new Book("Пушкин", "Евгений Онегин", 1833));
        shelf.addBook(new Book("Толстой", "Война и мир", 1869));
        shelf.addBook(new Book("Достоевский", "Преступление и наказание", 1866));
        shelf.addBook(new Book("Гоголь", "Мёртвые души", 1842));

        System.out.println("Самая ранняя книга: " + shelf.getEarliest());
        System.out.println("Самая поздняя книга: " + shelf.getLatest());

        shelf.sortByYear();
        System.out.println("\nКниги, отсортированные по году выпуска:");
        shelf.printAll();
    }
}