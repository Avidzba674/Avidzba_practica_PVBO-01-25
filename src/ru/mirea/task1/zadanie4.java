public class zadanie4 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        // Форматированный вывод: %-5d - номер, %.4f - число с 4 знаками после запятой
        for (int i = 1; i <= 10; i++) {
            double value = 1.0 / i;
            System.out.printf("Член %-2d: %.4f%n", i, value);
        }
    }
}