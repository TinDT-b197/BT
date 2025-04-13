package Bai2_10;

public class Main {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 5);
        MyPoint point2 = new MyPoint(4, 1);

        MyRectangle rectangle = new MyRectangle(point1, point2);

        System.out.println("Hinh chu nhat:");
        System.out.println(rectangle.toString());
        System.out.println("Dien tich cua hinh chu nhat: " + rectangle.getArea());
        System.out.println("Chu vi cua hinh chu nhat: " + rectangle.getPerimeter());

        point1.setX(2);
        point1.setY(6);

        System.out.println("\nHinh chu nhat sau khi thay doi:");
        System.out.println(rectangle.toString());
        System.out.println("Dien tich moi cua hinh chu nhat: " + rectangle.getArea());
        System.out.println("Chu vi moi cua hinh chu nhat: " + rectangle.getPerimeter());
    }
}
