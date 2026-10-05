package ru.mirea.task4.Zadanie1;

public class SeasonTest {
    public static void main(String[] args) {
        // 1) Любимое время года
        Season favorite = Season.SUMMER;

        System.out.println("Моё любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAvgTemperature() + "°C");
        System.out.println("Описание: " + favorite.getDescription());
        System.out.println();

        // 2) Метод со switch
        Season.printLove(favorite);
        Season.printLove(Season.WINTER);
        System.out.println();

        // 3) Цикл по всем временам года
        System.out.printf("%-10s %-15s %s%n", "Сезон", "Температура", "Описание");
        for (Season s : Season.values()) {
            System.out.printf("%-10s %-15s %s%n",
                    s, s.getAvgTemperature() + "°C", s.getDescription());
        }
    }
}