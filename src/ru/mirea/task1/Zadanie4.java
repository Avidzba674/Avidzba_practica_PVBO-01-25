package ru.mirea.task1;

public class Zadanie4 { // выводит 10 первых чисел гармонического ряда
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int i = 1; i <= 10; i++) {
            double value = 1.0 / i;
            System.out.printf("Член %-2d: %.4f%n", i, value);
        }
    }
}