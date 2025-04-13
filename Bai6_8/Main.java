package Bai6_8;

public class Main {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);

        Movable m2 = new MovableCircle(2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
