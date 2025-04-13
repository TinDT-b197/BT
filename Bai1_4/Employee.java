package Bai1_4;

public class Employee {
    private int ID;
    private String firstname;
    private String lastname;
    private int salary;
    public Employee(int ID, String firstname, String lastname, int salary) {
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getID() {
        return ID;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getName() {
        return firstname+lastname;
    }
    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary() {
        return (salary*12);
    }
    public int raiseSalary(int percent){
        return salary*percent;
    }

    @Override
    public String toString() {
        return "Bai1_4.Employee{" +
                "ID=" + ID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
