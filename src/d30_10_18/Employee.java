package d30_10_18;


public class Employee extends Person {

    private String office;
    private int salary;
    private MyDate hireDate;


    public Employee(String name, String address, int phoneNumber, String emailAddress, String office, int salary, MyDate hireDate) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(MyDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString(){
        return "Class: " + this.getClass().toString() + ". Name: " + getName() ;
    }
}
