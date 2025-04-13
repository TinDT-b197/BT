package Bai6_1;

public class Shape {
    protected String color = "red";
    protected Boolean filled = true;
    public Shape(){

    }
    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public String toString(){
        return "[ color= "+ color + "filled" + filled + "]";
    }
}
