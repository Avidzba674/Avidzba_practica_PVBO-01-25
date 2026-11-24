package ru.mirea.task10;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    private static Student[] iDNumber;

    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }

    public static void setArray() {
        iDNumber = new Student[] {
                new Student("Иван", "Иванов", "ПИ", 2, "ИКБО-01", 4.2),
                new Student("Пётр", "Петров", "ПИ", 3, "ИКБО-02", 3.8),
                new Student("Анна", "Сидорова", "БИ", 1, "ИКБО-03", 4.9),
                new Student("Олег", "Козлов", "ПИ", 2, "ИКБО-01", 3.5),
                new Student("Мария", "Орлова", "БИ", 4, "ИКБО-04", 4.5)
        };
    }

    public static void quicksort() {
        quickSort(iDNumber, 0, iDNumber.length - 1, new SortingStudentsByGPA());
    }

    public static void quickSort(Student[] array, int low, int high,
                                 Comparator<Student> comparator) {
        if (low >= high) {
            return;
        }
        Student pivot = array[(low + high) / 2];
        int i = low;
        int j = high;
        while (i <= j) {
            while (comparator.compare(array[i], pivot) < 0) {
                i++;
            }
            while (comparator.compare(array[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(array, low, j, comparator);
        quickSort(array, i, high, comparator);
    }

    public static void mergeSort(Student[] array, Comparator<Student> comparator) {
        if (array.length < 2) {
            return;
        }
        int middle = array.length / 2;
        Student[] left = Arrays.copyOfRange(array, 0, middle);
        Student[] right = Arrays.copyOfRange(array, middle, array.length);

        mergeSort(left, comparator);
        mergeSort(right, comparator);
        merge(array, left, right, comparator);
    }

    private static void merge(Student[] result, Student[] left, Student[] right,
                              Comparator<Student> comparator) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i], right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void outArray(Student[] array) {
        for (Student s : array) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static Student[] mergeLists(Student[] list1, Student[] list2,
                                       Comparator<Student> comparator) {
        Student[] a = list1.clone();
        Student[] b = list2.clone();
        mergeSort(a, comparator);
        mergeSort(b, comparator);
        Student[] result = new Student[a.length + b.length];
        merge(result, a, b, comparator);
        return result;
    }

    public static void main(String[] args) {
        Comparator<Student> byGpa = new SortingStudentsByGPA();

        setArray();
        System.out.println("Исходный массив:");
        outArray(iDNumber);

        quicksort();
        System.out.println("Quick sort по GPA (по убыванию):");
        outArray(iDNumber);

        setArray();
        mergeSort(iDNumber, byGpa);
        System.out.println("Merge sort по GPA (по убыванию):");
        outArray(iDNumber);

        Comparator<Student> byLastName = new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.getLastName().compareTo(b.getLastName());
            }
        };
        mergeSort(iDNumber, byLastName);
        System.out.println("Merge sort по фамилии:");
        outArray(iDNumber);

        Student[] list1 = {
                new Student("Иван", "Иванов", "ПИ", 2, "ИКБО-01", 4.2),
                new Student("Пётр", "Петров", "ПИ", 3, "ИКБО-02", 3.8),
                new Student("Анна", "Сидорова", "БИ", 1, "ИКБО-03", 4.9)
        };
        Student[] list2 = {
                new Student("Олег", "Козлов", "ПИ", 2, "ИКБО-01", 3.5),
                new Student("Мария", "Орлова", "БИ", 4, "ИКБО-04", 4.5),
                new Student("Егор", "Смирнов", "ПИ", 3, "ИКБО-02", 4.0)
        };
        Student[] merged = mergeLists(list1, list2, byGpa);
        System.out.println("Два списка, объединённые в один (по GPA по убыванию):");
        outArray(merged);
    }
}