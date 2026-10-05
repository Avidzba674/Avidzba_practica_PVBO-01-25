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
        } else {
            System.out.println("Массив заполнен!");
        }
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);
        tester.addCircle(new Circle(new Point(0, 0), 5));
        tester.addCircle(new Circle(new Point(3, 4), 2.5));
        tester.addCircle(new Circle(new Point(-1, -1), 10));

        System.out.println("Все окружности:");
        tester.printAll();
        System.out.println("Количество элементов: " + tester.count);
    }
}