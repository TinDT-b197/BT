package Bai1_2;

public class circle12 {
    private double radius = 1.0;
    public circle12() {

    }
    public circle12(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                '}';
    }
}
