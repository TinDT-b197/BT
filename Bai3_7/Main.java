package Bai3_7;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(7, 2.0f, 3.0f);
        Ball ball = new Ball(4.0f, 5.0f, 0.0f);

        System.out.println("Near the ball: " + player.near(ball));

        player.move(1.0f, 1.0f);
        System.out.println("After moving, near the ball: " + player.near(ball));

        player.kick(ball);

        System.out.println("Ball position: " + ball);
    }
}
