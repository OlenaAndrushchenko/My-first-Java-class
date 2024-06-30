package dev.olena.ex_person;

import dev.olena.ex_person.models.Person;

/**
 * Exercise Person Class
 */
public final class App {
    private App() {
    }

    /**
     * Print persons data
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person olena = new Person("Olena", "Andrushchenko", "Z0618199X", 1995, "Ukraine", 'F');
        Person anna = new Person("Anna", "Andrushchenko", "Y0000000X", 2004, "Ukraine", 'F');

        olena.print();
        anna.print();
    }
}
