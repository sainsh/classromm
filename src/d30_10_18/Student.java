package d30_10_18;

public class Student extends Person {

    private final String CLASSSTATUS;//freshman, sophomore, junior, senior

    public Student(String name, String address, int phoneNumber, String emailAddress, String CLASSSTATUS) {
        super(name, address, phoneNumber, emailAddress);
        this.CLASSSTATUS = CLASSSTATUS;
    }

    public String getCLASSSTATUS() {
        return CLASSSTATUS;
    }

    @Override
    public String toString(){
        return "Class: " + this.getClass().toString() + ". Name: " + getName() ;
    }
    
}
