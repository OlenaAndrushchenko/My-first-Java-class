package dev.olena.ex_person.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPersonHasAttributes() {
        Person pepa = new Person("pepa", "foo");
        assertEquals(2, pepa.getClass().getDeclaredFields().length);
    }

    @Test
    void testGetName() {
        // given
        Person pepa = new Person("pepa", "foo");
        assertEquals("pepa", pepa.getName());
    }

    @Test
    void testGetLastName() {
        // given
        Person pepa = new Person("pepa", "foo");
        assertEquals("foo", pepa.getLastName());
    }
}
