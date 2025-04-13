package Bai7_1;

import java.util.Date;

class Visit {
    private Customer customer;
    private boolean member = false;
    private Date date;
    private String memberType;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public boolean isMember() {
        return member;
    }

    public String getName() {
        return customer.getName();
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer.getName() +
                ", member=" + member +
                ", date=" + date +
                ", memberType='" + memberType + '\'' +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ", totalExpense=" + getTotalExpense() +
                '}';
    }
}

