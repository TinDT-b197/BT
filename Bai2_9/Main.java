package Bai2_9;

public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyPoint p3 = new MyPoint(3, 4);

        MyTriangle triangle = new MyTriangle(p1, p2, p3);

        System.out.println(triangle.toString());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Type: " + triangle.getType());
    }
}
