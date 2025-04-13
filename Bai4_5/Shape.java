package Bai4_5;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(){
        //
    }
    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "Shape: [Color: " + color + " Filled: " + filled +"]";
    }
}
