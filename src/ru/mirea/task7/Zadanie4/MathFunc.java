package ru.mirea.task7.Zadanie4;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double modulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Длина окружности, используя PI из интерфейса
    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}