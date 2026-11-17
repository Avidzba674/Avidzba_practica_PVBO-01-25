package ru.mirea.task8;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите A и B (каждое с новой строки):");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
