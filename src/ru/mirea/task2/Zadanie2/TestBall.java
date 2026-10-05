public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.5, 2.5);
        System.out.println(b1);

        b1.move(3.0, -1.0);
        System.out.println("После перемещения: " + b1);

        Ball b2 = new Ball();
        b2.setXY(10.0, 20.0);
        System.out.println("Второй мяч: " + b2);
    }
}