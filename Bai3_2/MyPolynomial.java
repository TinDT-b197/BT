package Bai3_2;

public class MyPolynomial {
    private double[] coeffs;

    // Constructor nhận vào các hệ số (coefficients)
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Phương thức trả về bậc của đa thức
    public int getDegree() {
        return coeffs.length - 1;
    }

    // Phương thức toString để biểu diễn đa thức dưới dạng chuỗi
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int degree = getDegree();
        for (int i = degree; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (i != degree) {
                    sb.append(coeffs[i] > 0 ? " + " : " - ");
                } else if (coeffs[i] < 0) {
                    sb.append("-");
                }

                // Thêm hệ số
                sb.append(Math.abs(coeffs[i]));

                // Thêm biến và bậc
                if (i > 0) sb.append("x");
                if (i > 1) sb.append("^").append(i);
            }
        }
        return sb.toString();
    }

    // Phương thức evaluate: Tính giá trị của đa thức tại x
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    // Phương thức add: Cộng hai đa thức
    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        // Cộng các hệ số của đa thức hiện tại
        for (int i = 0; i <= this.getDegree(); i++) {
            newCoeffs[i] += this.coeffs[i];
        }

        // Cộng các hệ số của đa thức truyền vào
        for (int i = 0; i <= right.getDegree(); i++) {
            newCoeffs[i] += right.coeffs[i];
        }

        return new MyPolynomial(newCoeffs);
    }

    // Phương thức multiply: Nhân hai đa thức
    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        // Nhân các hệ số của hai đa thức
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(newCoeffs);
    }
}

