package ru.mirea.task2.Zadanie10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст (можно несколько слов):");
        String line = sc.nextLine();

        // Убираем пробелы в начале и в конце
        line = line.trim();

        // Если строка пустая — слов 0
        if (line.isEmpty()) {
            System.out.println("Вы ввели 0 слов.");
        } else {
            // Разбиваем по любому количеству пробельных символов
            // \\s+ — это регулярное выражение: один или больше пробелов/табов
            String[] words = line.split("\\s+");
            System.out.println("Вы ввели " + words.length + " слов.");
        }

        sc.close();
    }
}