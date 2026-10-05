public class zadanie5 {

    // Метод класса для вычисления факториала
    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Ошибка для отрицательных чисел
        }

        long result = 1;
        // Использование управляющей конструкции цикла
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; // Число для проверки

        // Вызов метода
        long fact = calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен: " + fact);

        // Проверка другого числа
        System.out.println("Факториал числа 7 равен: " + calculateFactorial(7));
    }
}