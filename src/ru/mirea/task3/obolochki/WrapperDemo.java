package ru.mirea.task3.obolochki;

public class WrapperDemo {
    public static void main(String[] args) {

        // Создаю объекты класса Double, используя методы valueOf()
        Double doubleObj1 = Double.valueOf(65.9);       // из примитива
        Double doubleObj2 = Double.valueOf("123.45");   // из строки

        // Вывожу значение объекта Double на консоль
        System.out.println("Объект Double 1: " + doubleObj1);
        System.out.println("Объект Double 2: " + doubleObj2);

        // Преобразовываю значение типа String к типу double
        String strValue = "42.195";
        double parsedDouble = Double.parseDouble(strValue);
        System.out.println("Строка '" + strValue + "' преобразована в double: " + parsedDouble);

        byte b = doubleObj1.byteValue();
        short sh = doubleObj1.shortValue();
        int i = doubleObj1.intValue();
        long l = doubleObj1.longValue();
        float f = doubleObj1.floatValue();
        double d = doubleObj1.doubleValue();

        // Для boolean и char прямого преобразования из Double нет.
        // boolean нельзя получить из числа.
        // Для char нужно двойное приведение: Double -> int -> char.
        char ch = (char) doubleObj1.intValue();

        System.out.println("\nПреобразование объекта Double (" + doubleObj1 + ") в примитивы:");
        System.out.println("byte    = " + b);
        System.out.println("short   = " + sh);
        System.out.println("int     = " + i);
        System.out.println("long    = " + l);
        System.out.println("float   = " + f);
        System.out.println("double  = " + d);
        System.out.println("char    = " + ch + " (код: " + (int)ch + ")");

        // ПУНКТ 5: Преобразовать литерал типа double к строке
        String dStr = Double.toString(3.14);
        System.out.println("\nЛитерал 3.14 преобразован в строку: " + dStr);
    }
}