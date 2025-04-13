package Bai3_5;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date = new MyDate(2024, 2, 28);
        System.out.println(date);              // Output: Thursday 28 Feb 2024
        System.out.println(date.nextDay());    // Output: Friday 29 Feb 2024
        System.out.println(date.nextDay());    // Output: Saturday 1 Mar 2024
        System.out.println(date.previousDay());// Output: Friday 29 Feb 2024
    }
}
