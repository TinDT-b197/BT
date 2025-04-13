package Bai8_1;

public class Main {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(5);

        System.out.println("Pushing elements:");
        System.out.println(stack.push(10));
        System.out.println(stack.push(20));
        System.out.println(stack.push(30));
        System.out.println(stack.push(40));
        System.out.println(stack.push(50));
        System.out.println(stack.push(60));

        System.out.println("\nPopping elements:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
