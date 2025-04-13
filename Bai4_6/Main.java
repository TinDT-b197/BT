package Bai4_6;

public class Main {
    public static void main(String[] args) {
        Cat f1=new Cat("meow");
        System.out.println(f1);
        f1.greet();
        Dog d1=new Dog("ken");
        Dog d2=new Dog("milu");
        System.out.println(d1);
        d1.greets();
        d2.greets(d2);

    }
}
