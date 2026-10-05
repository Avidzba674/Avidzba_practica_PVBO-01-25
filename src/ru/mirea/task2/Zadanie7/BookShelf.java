package ru.mirea.task2.Zadanie7;

import java.util.ArrayList;
import java.util.Comparator;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(Book b) {
        books.remove(b);
    }

    // Книга с самым ранним годом издания
    public Book getEarliest() {
        return books.stream()
                .min(Comparator.comparingInt(Book::getYear))
                .orElse(null);
    }

    // Книга с самым поздним годом издания
    public Book getLatest() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getYear))
                .orElse(null);
    }

    // Расставить книги по возрастанию года выпуска
    public void sortByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }

    public void printAll() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}