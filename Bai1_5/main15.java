package Bai1_5;

public class main15 {
    public static void main(String[] args) {
        invoiceitem i1 = new invoiceitem("A5", "bút đỏ", 888, 0.08);
        System.out.println(i1);
        System.out.println("id: " + i1.getID());
        System.out.println("desc: " + i1.getdesc());
        System.out.println("qty: " + i1.getQty());
        System.out.println("unitPrice: " + i1.getUnitPrice());

    }
}
