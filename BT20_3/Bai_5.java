package BT20_3;

import java.io.File;

public class Bai_5 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\LENOVO\\bt.txt");
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                System.out.println("Danh sách file trong thư mục:");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("Thư mục trống.");
            }
        } else {
            System.out.println("Thư mục không tồn tại.");
        }
    }
}

