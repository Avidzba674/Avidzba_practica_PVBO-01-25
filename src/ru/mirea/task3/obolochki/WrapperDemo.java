public class WrapperDemo {
    public static void main(String[] args) {
        // 1. Создание объекта Double через valueOf()
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.71828");

        // 2. String -> double через parseDouble()
        String s = "42.195";
        double parsed = Double.parseDouble(s);

        // 3. Преобразование объекта Double ко всем примитивным типам
        Double obj = Double.valueOf(65.9);

        byte b = obj.byteValue();
        short sh = obj.shortValue();
        int i = obj.intValue();
        long l = obj.longValue();
        float f = obj.floatValue();
        double d = obj.doubleValue();
        boolean bool = obj.isNaN(); // "приведение" к boolean по смыслу — проверка NaN
        char ch = (char) obj.intValue(); // условно — по ASCII-коду

        // 4. Вывод значения объекта Double
        System.out.println("Объект Double: " + obj);

        // 5. Литерал double -> String
        String dStr = Double.toString(3.14);
        System.out.println("Строка из литерала: " + dStr);

        // Демонстрация всех приведений
        System.out.println("byteValue    = " + b);
        System.out.println("shortValue   = " + sh);
        System.out.println("intValue     = " + i);
        System.out.println("longValue    = " + l);
        System.out.println("floatValue   = " + f);
        System.out.println("doubleValue  = " + d);
        System.out.println("isNaN (bool) = " + bool);
        System.out.println("charValue    = " + ch);
        System.out.println("parsed       = " + parsed);
        System.out.println("d1, d2       = " + d1 + ", " + d2);
    }
}