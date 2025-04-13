package Bai2_10;

public class MyRectangle {
    private MyPoint topLeft, bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public double getArea() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return width * height;
    }

    public double getPerimeter() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return 2 * (width + height);
    }

    public String toString() {
        return "Top Left: " + topLeft.toString() + ", Bottom Right: " + bottomRight.toString();
    }
}

