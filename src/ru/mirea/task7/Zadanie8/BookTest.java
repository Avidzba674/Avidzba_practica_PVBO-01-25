package ru.mirea.task7.Zadanie8;

public class BookTest {
    public static void main(String[] args) {
        Printable[] items = {
                new Book("Война и мир", "Л. Н. Толстой", 1869),
                new Journal("Хакер"),
                new Book("Отцы и дети", "И. С. Тургенев", 1862),
                new Journal("Компьютерра"),
                new Book("Преступление и наказание", "Ф. М. Достоевский", 1866)
        };

        // Печатаем все объекты (полиморфно)
        System.out.println("=== Все объекты ===");
        for (Printable p : items) {
            p.print();
        }

        System.out.println();

        // Печатаем только книги через статический метод
        Book.printBooks(items);
    }
}