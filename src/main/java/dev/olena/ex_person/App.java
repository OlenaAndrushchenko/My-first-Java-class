package dev.olena.ex_person;

import dev.olena.ex_person.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person olena = new Person("Olena", "Andrushchenko", "Z0618199X", 1995);
        Person anna = new Person("Anna", "Andrushchenko", "Y0000000X", 2004);

        olena.print();
        anna.print();
    }
}
