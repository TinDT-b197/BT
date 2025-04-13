package Bai4_2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    public Student(String name, String address,String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Double getFee() {
        return fee;
    }
    public void setFee(Double fee) {
        this.fee = fee;
    }
    public String toString() {
        return "Student [" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}
