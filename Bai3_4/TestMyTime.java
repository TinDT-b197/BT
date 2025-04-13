package Bai3_4;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(14, 59, 59);
        System.out.println("Current time: " + time);
        time.nextSecond();
        System.out.println("Next second: " + time);
        time.previousSecond();
        System.out.println("Previous second: " + time);
    }
}

