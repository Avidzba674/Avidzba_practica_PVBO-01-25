package ru.mirea.task2.Zadanie6;

class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public double getR() { return r; }
    public void setR(double r) { this.r = r; }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getLength() {
        return 2 * Math.PI * r;
    }

    public boolean equals(Circle other) {
        return this.r == other.r &&
                this.x == other.x &&
                this.y == other.y;
    }

    @Override
    public String toString() {
        return "Circle{x=" + getX() + ", y=" + getY() + ", r=" + getR() + "}";
    }
}

class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 5);
        Circle c2 = new Circle(1, 1, 5);
        Circle c3 = new Circle(0, 0, 5);

        System.out.println("Площадь c1 = " + c1.getArea());
        System.out.println("Длина c1 = " + c1.getLength());

        System.out.println("c1 == c2? " + c1.equals(c2));
        System.out.println("c1 == c3? " + c1.equals(c3));

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}