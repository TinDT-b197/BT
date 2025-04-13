package Bai4_1;

public class main {
    public static void main(String[] args) {
        Circle c1 = new Circle(4.5);
        System.out.println(c1.getArea());
        Circle c2 = new Circle(4.5,"den");
        System.out.println(c2);
        Cylinder c3 = new Cylinder(4.5);
        System.out.println(c3);
        Cylinder c4 = new Cylinder(5.0,6.7,"xam");
        System.out.println(c4.getVolume());
        System.out.println(c4);
    }
}
