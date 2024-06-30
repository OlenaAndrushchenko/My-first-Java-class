package dev.olena.ex_person.models;

//class created 
// create atribute name

// commands 
// ctrl + . (actions and quick fix)
// Right mouse click (access to source Action)
// shift + alt + f (format file)

public class Person {

    private String name;
    private String lastName;

    
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void print() {
        System.out.println("Person: " + name + "," + lastName);
    }
}
