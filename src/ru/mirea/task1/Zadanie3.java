package ru.mirea.task1;

public class Zadanie3 {
    public static void main(String[] args) { // массив аргументов командной строки
        System.out.println("Аргументы командной строки:");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}