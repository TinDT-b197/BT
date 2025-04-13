package Bai2_8;

public class Main {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(2, 3, 5);
        MyCircle circle2 = new MyCircle(4, 7, 10);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Area of circle2: " + circle2.getArea());

        System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));
    }
}
