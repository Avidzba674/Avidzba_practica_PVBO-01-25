package ru.mirea.task9;

public class InsertionSortTest { //вставками

    public static <T extends Comparable<T>> void insertionSort(T[] list) { //generic (для любого Т который умеет сравнивать себя с другим Т)
        for (int i = 1; i < list.length; i++) {
            T key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo(key) > 0) { // сравнивание list[j] c key
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static <T> void printArray(T[] array) {
        for (T o : array) { // для любого о типа Т из массива array выполни цикл
            System.out.println(o);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(1045, "Иван", "Иванов", 4.2),
                new Student(1012, "Анна", "Сидорова", 4.9),
                new Student(1078, "Пётр", "Петров", 3.8),
                new Student(1003, "Мария", "Орлова", 4.5),
                new Student(1061, "Олег", "Козлов", 3.5)
        };

        System.out.println("До сортировки:");
        printArray(students);

        insertionSort(students);
        System.out.println("После сортировки вставками по iDNumber:");
        printArray(students);

        String[] names = {"Олег", "Анна", "Пётр", "Иван"};
        insertionSort(names);
        System.out.println("Тот же метод для строк:");
        printArray(names);
    }
}