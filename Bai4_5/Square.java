package Bai4_5;

public class Square extends Shape{
    public double side;
    public Square(){

    }
    public Square(double side){
        this.side = side;

    }
    public Square(double side, String color, boolean filled) {
        super(filled, color);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double side){
        this.side = side;
    }
    public void setLength(double side){
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
