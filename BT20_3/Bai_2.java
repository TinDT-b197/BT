package BT20_3;

import java.io.*;

public class Bai_2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("output.txt")) {
            System.out.println("Nhập nội dung (gõ 'exit' để kết thúc):");
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line + "\n");
            }
            System.out.println("Dữ liệu đã được ghi vào output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

