package d30_10_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaffTest {

    @Test
    public String toString() {

        Staff s1 = new Staff("Thomas","gade 33", 22338899,"email@email.com","easj",30000, new MyDate(),"senior");
        assertEquals("Class: Staff. Name: Thomas",s1.toString());
        
        return "";
    }
}