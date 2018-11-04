package d30_10_18;

import static org.junit.Assert.*;

public class StudentTest {

    @org.junit.Test
    public String toString() {

        Student s1 = new Student("Thomas","gade 33",22448877,"email@email.com","freshman");
        assertEquals("Class: Student. Name: Thomas",s1.toString());
       return "";
    }
}