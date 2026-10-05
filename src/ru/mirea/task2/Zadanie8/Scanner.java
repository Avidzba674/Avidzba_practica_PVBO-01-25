package ru.mirea.task2.Zadanie8;

import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int n = sc.nextInt();
        sc.nextLine(); // съедаем остаток строки после nextInt()

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // Реверс массива без дополнительного массива
        for (int i = 0; i < n / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("Массив в обратном порядке:");
        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}