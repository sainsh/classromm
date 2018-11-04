package d30_10_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public String toString() {
        Employee e1 = new Employee("Thomas","gade 33", 22338899,"email@email.com","easj",30000, new MyDate());
        assertEquals("Class: Employee. Name: Thomas",e1.toString());
        return "";
    }
}