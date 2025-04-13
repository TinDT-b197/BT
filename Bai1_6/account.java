package Bai1_6;

public class account {
    private String id;
    private String name;
    private int balance=0;
    public account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getname() {
        return name;
    }
    public int getbalance() {
        return balance;
    }
    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }
    public int debit(int amount) {
        balance = balance - amount;
        return balance;
    }
    public int transferTo(account another, int amount) {
        if (amount <= balance) {
        } else {
            System.out.println("Amount exceeded balance ");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Bai1_6.account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
