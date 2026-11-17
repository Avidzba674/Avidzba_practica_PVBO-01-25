package ru.mirea.task8;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = sc.nextInt();

        int count = 0; // сколько чисел уже вывели
        // Внешний цикл for, который генерирует числа 1, 2, 3...
        for (int i = 1; count < n; i++) {
            // Выводим число i ровно i раз, но следим, чтобы не превысить n
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
    }
}