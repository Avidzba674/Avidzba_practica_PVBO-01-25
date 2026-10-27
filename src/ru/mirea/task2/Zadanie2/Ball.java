package ru.mirea.task2.Zadanie2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) { // конструктор
        this.x = x;
        this.y = y;
    }

    public Ball() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() { // геттеры - возвращают значнеие поля
        return x;
    }

    public void setX(double x) { // сеттеры - устанавливают новое значение поля
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) { // задает сразу две координаты
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" + "x=" + x + ", y=" + y + '}';
    }
}