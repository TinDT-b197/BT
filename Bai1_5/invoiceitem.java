package Bai1_5;

public class invoiceitem {
    private String ID;
    private String desc;
    private int qty;
    private double unitPrice;
    public invoiceitem(String ID, String desc, int qty, double unitPrice) {
        this.ID = ID;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getID(){
        return this.ID;
    }
    public String getdesc(){
        return this.desc;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return this.qty * this.unitPrice;
    }

    @Override
    public String toString() {
        return "Bai1_5.invoiceitem{" +
                "ID='" + ID + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
