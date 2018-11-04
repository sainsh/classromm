package d30_10_18;

public class Faculty extends Employee {

    private int officeHours;
    private int rank;

    public Faculty(String name, String address, int phoneNumber, String emailAddress, String office, int salary, MyDate hireDate, int officeHours, int rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Class: " + this.getClass().toString() + ". Name: " + getName() ;
    }
}
