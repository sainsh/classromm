package d30_10_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class FacultyTest {

    @Test
    public String toString() {
        Faculty f1 = new Faculty("Thomas","gade 33", 22338899,"email@email.com","easj", 30000, new MyDate(),37,4);
        assertEquals("Class: Faculty. Name: Thomas",f1.toString());
        
        return "";
    }
}