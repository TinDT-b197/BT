package Bai2_7;

public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyLine line = new MyLine(p1, p2);
        System.out.println("Line: " + line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());
    }
}
