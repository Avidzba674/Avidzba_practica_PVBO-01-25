package ru.mirea.task1;

public class Zadanie5 { // вычисляет факториал числа

    public static long calculateFactorial(int n) { //примитивный тип данных, который используется для хранения целых чисел сзнаком
        if (n < 0) {
            return -1;
        }

        long result = 1; // тип возвращаемого значения
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        long fact = calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен: " + fact);

        System.out.println("Факториал числа 7 равен: " + calculateFactorial(7));
    }
}