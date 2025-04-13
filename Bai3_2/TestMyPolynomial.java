package Bai3_2;

public class TestMyPolynomial {
    public static void main(String[] args) {
        // Tạo đa thức p1 = 3x^2 + 4x + 5
        MyPolynomial p1 = new MyPolynomial(5, 4, 3);

        // Tạo đa thức p2 = 1x^3 - 2x + 3
        MyPolynomial p2 = new MyPolynomial(3, -2, 0, 1);

        // In ra đa thức
        System.out.println("Đa thức p1: " + p1);
        System.out.println("Đa thức p2: " + p2);

        // Tính giá trị đa thức tại x = 2
        System.out.println("Giá trị của p1 tại x = 2: " + p1.evaluate(2));

        // Cộng hai đa thức
        MyPolynomial sum = p1.add(p2);
        System.out.println("Tổng của p1 và p2: " + sum);

        // Nhân hai đa thức
        MyPolynomial product = p1.multiply(p2);
        System.out.println("Tích của p1 và p2: " + product);
    }
}
