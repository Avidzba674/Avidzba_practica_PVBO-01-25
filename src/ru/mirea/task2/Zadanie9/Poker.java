package ru.mirea.task2.Zadanie9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        // 1. Создаём колоду: 4 масти × 13 рангов = 52 карты
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        ArrayList<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + suit);
            }
        }

        // 2. Перемешиваем колоду
        Collections.shuffle(deck);

        // 3. Запрашиваем количество игроков
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();

        // 4. Проверка: на n игроков нужно n*5 карт
        if (n <= 0) {
            System.out.println("Количество игроков должно быть положительным.");
            return;
        }
        if (n * 5 > deck.size()) {
            System.out.println("Слишком много игроков! В колоде всего " + deck.size() + " карт.");
            return;
        }

        // 5. Раздача карт
        int index = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Игрок " + i + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print(deck.get(index++) + " ");
            }
            // Разделяем игроков пустой строкой
            System.out.println("\n");
        }

        sc.close();
    }
}