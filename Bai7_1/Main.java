package Bai7_1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Visit visit = new Visit("Do", new Date());
        visit.setMember(true);
        visit.setMemberType("gold");
        visit.setServiceExpense(500);
        visit.setProductExpense(200);

        double serviceDiscount = DiscountRate.getServiceDiscountRate(visit.getMemberType());
        double productDiscount = DiscountRate.getProductDiscountRate(visit.getMemberType());

        System.out.println("Service Discount: " + (visit.getServiceExpense() * serviceDiscount));
        System.out.println("Product Discount: " + (visit.getProductExpense() * productDiscount));
        System.out.println("Total Expense after Discount: " + (visit.getTotalExpense() - (visit.getServiceExpense() * serviceDiscount) - (visit.getProductExpense() * productDiscount)));
        System.out.println(visit.toString());
    }
}
