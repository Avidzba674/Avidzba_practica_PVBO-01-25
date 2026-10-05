package ru.mirea.task3.Zadanie2;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle c) {
        if (count < circles.length) {
            circles[count++] = c;
        }
    }

    public Circle findSmallest() {
        Circle min = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < min.getRadius()) min = circles[i];
        }
        return min;
    }

    public Circle findLargest() {
        Circle max = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > max.getRadius()) max = circles[i];
        }
        return max;
    }

    public void sort() {
        Arrays.sort(circles, 0, count);
    }

    public void printAll() {
        for (int i = 0; i < count; i++) System.out.println(circles[i]);
    }

    public static void main(String[] args) {
        Tester t = new Tester(5);
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            Point p = new Point(rand.nextInt(100), rand.nextInt(100));
            double r = 1 + Math.random() * 19; // радиус от 1 до 20
            t.addCircle(new Circle(p, r));
        }

        System.out.println("Исходные окружности:");
        t.printAll();

        System.out.println("\nСамая маленькая: " + t.findSmallest());
        System.out.println("Самая большая:    " + t.findLargest());

        t.sort();
        System.out.println("\nОтсортированные по радиусу:");
        t.printAll();
    }
}