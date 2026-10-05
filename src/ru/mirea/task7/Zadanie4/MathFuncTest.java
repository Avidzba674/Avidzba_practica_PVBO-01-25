package ru.mirea.task7.Zadanie4;

public class MathFuncTest {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        System.out.println("PI = " + MathCalculable.PI);
        System.out.println("2^10 = " + mc1.power(2, 10));
        System.out.println("|3 + 4i| = " + mc1.modulus(3, 4));

        MathFunc mf = new MathFunc();
        System.out.println("Длина окружности r=5: " + mf.circleLength(5));

    }
}