package dev.olena.ex_person.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPersonHasAttributes() {
        Person pepa = new Person("pepa", "foo", "Z0618199X", 1995, "Spain", 'F');
        assertEquals(6, pepa.getClass().getDeclaredFields().length);
    }

    @Test
    void testGetName() {
        // given
        Person pepa = new Person("pepa", "foo", "Z0618199X", 1995, "Spain", 'F');
        assertEquals("pepa", pepa.getName());
    }

    @Test
    void testGetLastName() {
        // given
        Person pepa = new Person("pepa", "foo", "Z0618199X", 1995, "Spain", 'F');
        assertEquals("foo", pepa.getLastName());
    }

    @Test
    void testGetId() {
        // given
        Person pepa = new Person("pepa", "foo", "Z0618199X", 1995, "Spain", 'F');
        assertEquals("Z0618199X", pepa.getId());
    }

	@Test
	void testGetYearOfBirth() {
		// given
        Person pepa = new Person("pepa", "foo", "Z0618199X", 1995, "Spain", 'F');
        assertEquals(1995, pepa.getYearOfBirth());
	}

	@Test
	void testGetCountryOfBirth() {
		// given
        Person pepa = new Person("pepa", "foo", "Z0618199X", 1995, "Spain", 'F');
        assertEquals("Spain", pepa.getCountryOfBirth());
	}

	@Test
	void testGetGender() {
		// given
        Person pepa = new Person("pepa", "foo", "Z0618199X", 1995, "Spain", 'F');
        assertEquals('F', pepa.getGender());
	}
}
