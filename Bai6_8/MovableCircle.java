package Bai6_8;

public class MovableCircle {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius){
        center = new MovablePoint(x, y, xspeed, yspeed);
        this.radius = radius;
    }
    public void move(){
        center.y -= center.yspeed;
    }

}
