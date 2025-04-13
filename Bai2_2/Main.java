package Bai2_2;

public class Main {
    public static void main(String[] args) {
        Author a =new Author("thắng", "@gmail.com", 't');
        Book b = new Book("Thắng", a, 20000, 10);
        System.out.println(b);
    }
}
