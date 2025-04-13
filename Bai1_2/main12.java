package Bai1_2;

public class main12 {
    public static void main(String[] args) {
        circle12 c1 = new circle12(1.1);
        System.out.println(c1);
        circle12 c2 = new circle12();
        System.out.println(c2);
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
