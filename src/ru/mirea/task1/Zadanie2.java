package ru.mirea.task1;
import java.util.Scanner;

public class Zadanie2 { // программа считает сумму, максимальное и минимальное число
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner - это читатель, который подключается в клавиатуре
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) { //создание пустого массива из 5 нулей
            numbers[i] = scanner.nextInt();
        }

        int sumWhile = 0; // цикл с предусловием
        int indexWhile = 0;
        while (indexWhile < numbers.length) {
            sumWhile += numbers[indexWhile];
            indexWhile++;
        }
        System.out.println("Сумма (while): " + sumWhile);

        int sumDoWhile = 0; // цикл с постусловием
        int indexDo = 0;
        if (numbers.length > 0) {
            do {
                sumDoWhile += numbers[indexDo];
                indexDo++;
            } while (indexDo < numbers.length);
        }
        System.out.println("Сумма (do while): " + sumDoWhile);

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        scanner.close();
    }
}