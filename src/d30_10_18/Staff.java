package d30_10_18;

public class Staff extends Employee {

    private String title;

    public Staff(String name, String address, int phoneNumber, String emailAddress, String office, int salary, MyDate hireDate, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, hireDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Class: " + this.getClass().toString() + ". Name: " + getName() ;
    }
}
