package ru.mirea.task8;

import java.util.Scanner;

public class zadanie1 { // числа i повторяются i раз
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
    }
}