package d30_10_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public String toString() {

        Person p1 = new Person("Thomas","gade 33", 22338899, "email@email.com");
        assertEquals("Class: Person. Name: Thomas",p1.toString());

        return "";
    }
}