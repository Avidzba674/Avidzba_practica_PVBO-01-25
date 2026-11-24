package ru.mirea.task12;

import javax.swing.*;
import java.awt.*;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

class Triangle extends Shape {
    private int size;

    public Triangle(Color color, int x, int y, int size) {
        super(color, x, y);
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int[] xs = {x, x + size, x + size / 2};
        int[] ys = {y + size, y + size, y};
        g.fillPolygon(xs, ys, 3);
    }
}

class RandomShapes extends JFrame {
    Shape[] shapes = new Shape[20];

    public RandomShapes() {
        super("20 случайных фигур");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < shapes.length; i++) {
            int r = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            Color color = new Color(r, g, b);
            int x = (int) (Math.random() * 650);
            int y = (int) (Math.random() * 450);
            int type = (int) (Math.random() * 3);

            if (type == 0) {
                shapes[i] = new Circle(color, x, y, 20 + (int) (Math.random() * 40));
            } else if (type == 1) {
                shapes[i] = new Rectangle(color, x, y,
                        30 + (int) (Math.random() * 100), 30 + (int) (Math.random() * 80));
            } else {
                shapes[i] = new Triangle(color, x, y, 40 + (int) (Math.random() * 80));
            }
        }

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Shape s : shapes) {
                    s.draw(g);
                }
            }
        };
        panel.setBackground(Color.WHITE);
        add(panel);
    }

    public static void main(String[] args) {
        new RandomShapes().setVisible(true);
    }
}