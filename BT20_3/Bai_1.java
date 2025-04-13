package BT20_3;

import java.io.*;

public class Bai_1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Đã sao chép nội dung từ input.txt sang output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

