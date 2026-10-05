package ru.mirea.task3.Zadanie4;

import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        // Ввод n с проверкой
        while (true) {
            System.out.print("Введите размер массива (натуральное число > 0): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                else System.out.println("Число должно быть больше 0. Повторите ввод.");
            } else {
                System.out.println("Это не целое число. Повторите ввод.");
                sc.next(); // выбросить некорректный ввод
            }
        }

        // Первый массив
        int[] arr = new int[n];
        System.out.print("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (n + 1)); // [0; n]
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Считаем количество чётных
        int cnt = 0;
        for (int v : arr) if (v % 2 == 0) cnt++;

        if (cnt == 0) {
            System.out.println("Чётных элементов в массиве нет.");
        } else {
            int[] even = new int[cnt];
            int k = 0;
            for (int v : arr) if (v % 2 == 0) even[k++] = v;

            System.out.print("Массив чётных элементов: ");
            for (int v : even) System.out.print(v + " ");
            System.out.println();
        }

        sc.close();
    }
}